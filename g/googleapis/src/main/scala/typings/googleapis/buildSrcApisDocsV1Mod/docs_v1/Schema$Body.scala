package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The document body.  The body typically contains the full document contents
  * except for headers, footers and footnotes.
  */
@js.native
trait Schema$Body extends js.Object {
  /**
    * The contents of the body.  The indexes for the body&#39;s content begin
    * at zero.
    */
  var content: js.UndefOr[js.Array[Schema$StructuralElement]] = js.native
}

object Schema$Body {
  @scala.inline
  def apply(content: js.Array[Schema$StructuralElement] = null): Schema$Body = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Body]
  }
}

