package typings.firebase.mod.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result returned by list().
  */
trait ListResult extends js.Object {
  /**
    * Objects in this directory.
    * You can call getMetadate() and getDownloadUrl() on them.
    */
  var items: js.Array[Reference]
  /**
    * If set, there might be more results for this list. Use this token to resume the list.
    */
  var nextPageToken: String | Null
  /**
    * References to prefixes (sub-folders). You can call list() on them to
    * get its contents.
    *
    * Folders are implicit based on '/' in the object paths.
    * For example, if a bucket has two objects '/a/b/1' and '/a/b/2', list('/a')
    * will return '/a/b' as a prefix.
    */
  var prefixes: js.Array[Reference]
}

object ListResult {
  @scala.inline
  def apply(items: js.Array[Reference], prefixes: js.Array[Reference], nextPageToken: String = null): ListResult = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], prefixes = prefixes.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResult]
  }
}

