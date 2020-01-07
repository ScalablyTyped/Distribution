package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A document header.
  */
@js.native
trait Schema$Header extends js.Object {
  /**
    * The contents of the header.  The indexes for a header&#39;s content begin
    * at zero.
    */
  var content: js.UndefOr[js.Array[Schema$StructuralElement]] = js.native
  /**
    * The ID of the header.
    */
  var headerId: js.UndefOr[String] = js.native
}

object Schema$Header {
  @scala.inline
  def apply(content: js.Array[Schema$StructuralElement] = null, headerId: String = null): Schema$Header = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (headerId != null) __obj.updateDynamic("headerId")(headerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Header]
  }
}

