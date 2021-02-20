package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartitionResolver extends StObject {
  
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
  implicit class PartitionResolverMutableBuilder[Self <: PartitionResolver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPartitionKey(value: js.Any => String): Self = StObject.set(x, "getPartitionKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolveForCreate(value: String => String): Self = StObject.set(x, "resolveForCreate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolveForRead(value: js.Any => js.Array[String]): Self = StObject.set(x, "resolveForRead", js.Any.fromFunction1(value))
  }
}
