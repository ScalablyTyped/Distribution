package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A document footer.
  */
@js.native
trait Schema$Footer extends js.Object {
  /**
    * The contents of the footer.  The indexes for a footer&#39;s content begin
    * at zero.
    */
  var content: js.UndefOr[js.Array[Schema$StructuralElement]] = js.native
  /**
    * The ID of the footer.
    */
  var footerId: js.UndefOr[String] = js.native
}

object Schema$Footer {
  @scala.inline
  def apply(content: js.Array[Schema$StructuralElement] = null, footerId: String = null): Schema$Footer = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (footerId != null) __obj.updateDynamic("footerId")(footerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Footer]
  }
}

