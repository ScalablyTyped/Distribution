package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartitionResolver extends js.Object {
  /**
    * Extracts the partition key from the specified document using the partitionKeyExtractor
    * @param document - The document from which to extract the partition key.
    */
  def getPartitionKey(document: js.Any): String = js.native
  /**
    * Given a partition key, returns the correct collection link for creating a document.
    * @param partitionKey - The partition key used to determine the target collection for create
    */
  def resolveForCreate(partitionKey: String): String = js.native
  /**
    * Given a partition key, returns a list of collection links to read from.
    * @param partitionKey - The partition key used to determine the target collection for query
    */
  def resolveForRead(partitionKey: js.Any): js.Array[String] = js.native
}

object PartitionResolver {
  @scala.inline
  def apply(
    getPartitionKey: js.Any => String,
    resolveForCreate: String => String,
    resolveForRead: js.Any => js.Array[String]
  ): PartitionResolver = {
    val __obj = js.Dynamic.literal(getPartitionKey = js.Any.fromFunction1(getPartitionKey), resolveForCreate = js.Any.fromFunction1(resolveForCreate), resolveForRead = js.Any.fromFunction1(resolveForRead))
    __obj.asInstanceOf[PartitionResolver]
  }
  @scala.inline
  implicit class PartitionResolverOps[Self <: PartitionResolver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetPartitionKey(value: js.Any => String): Self = this.set("getPartitionKey", js.Any.fromFunction1(value))
    @scala.inline
    def setResolveForCreate(value: String => String): Self = this.set("resolveForCreate", js.Any.fromFunction1(value))
    @scala.inline
    def setResolveForRead(value: js.Any => js.Array[String]): Self = this.set("resolveForRead", js.Any.fromFunction1(value))
  }
  
}

