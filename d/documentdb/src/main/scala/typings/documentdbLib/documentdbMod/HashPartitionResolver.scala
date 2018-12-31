package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("documentdb", "HashPartitionResolver")
@js.native
class HashPartitionResolver protected () extends PartitionResolver {
  /**
    * DEPRECATED
    *
    * Support for IPartitionResolver is now obsolete.
    * It's recommended that you use Partitioned Collections for higher storage and throughput.
    *
    * @deprecated
    * @param partitionKeyExtractor - If partitionKeyExtractor is a string, it should be the name of the property in the document to execute the hashing on.
    *        If partitionKeyExtractor is a function, it should be a function to extract the partition key from an object.
    * @param collectionLink        - Array of strings in the format 'dbs/foo/colls/bar'
    * @param options               - Options forr the ConsistentHashRing (MurmurHash)
    */
  def this(partitionKeyExtractor: java.lang.String, collectionLinks: js.Array[java.lang.String]) = this()
  def this(partitionKeyExtractor: js.Function1[/* obj */ js.Any, _], collectionLinks: js.Array[java.lang.String]) = this()
  def this(partitionKeyExtractor: java.lang.String, collectionLinks: js.Array[java.lang.String], options: ConsistentHashRingOptions) = this()
  def this(partitionKeyExtractor: js.Function1[/* obj */ js.Any, _], collectionLinks: js.Array[java.lang.String], options: ConsistentHashRingOptions) = this()
  /**
    * Extracts the partition key from the specified document using the partitionKeyExtractor
    * @param document - The document from which to extract the partition key.
    */
  /* CompleteClass */
  override def getPartitionKey(document: js.Any): java.lang.String = js.native
  /**
    * Given a partition key, returns the correct collection link for creating a document.
    * @param partitionKey - The partition key used to determine the target collection for create
    */
  /* CompleteClass */
  override def resolveForCreate(partitionKey: java.lang.String): java.lang.String = js.native
  /**
    * Given a partition key, returns a list of collection links to read from.
    * @param partitionKey - The partition key used to determine the target collection for query
    */
  def resolveForRead(partitionKey: java.lang.String): js.Array[java.lang.String] = js.native
  /**
    * Given a partition key, returns a list of collection links to read from.
    * @param partitionKey - The partition key used to determine the target collection for query
    */
  /* CompleteClass */
  override def resolveForRead(partitionKey: js.Any): js.Array[java.lang.String] = js.native
}

