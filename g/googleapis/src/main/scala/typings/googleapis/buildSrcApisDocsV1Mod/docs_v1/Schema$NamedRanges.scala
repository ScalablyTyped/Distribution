package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of all the NamedRanges in the document that share a given
  * name.
  */
@js.native
trait Schema$NamedRanges extends js.Object {
  /**
    * The name that all the named ranges share.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The NamedRanges that share the same name.
    */
  var namedRanges: js.UndefOr[js.Array[Schema$NamedRange]] = js.native
}

object Schema$NamedRanges {
  @scala.inline
  def apply(name: String = null, namedRanges: js.Array[Schema$NamedRange] = null): Schema$NamedRanges = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namedRanges != null) __obj.updateDynamic("namedRanges")(namedRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NamedRanges]
  }
}

