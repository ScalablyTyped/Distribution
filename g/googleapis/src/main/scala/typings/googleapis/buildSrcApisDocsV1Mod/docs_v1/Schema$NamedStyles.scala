package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The named styles. Paragraphs in the document can inherit their TextStyle
  * and ParagraphStyle from these named styles.
  */
@js.native
trait Schema$NamedStyles extends js.Object {
  /**
    * The named styles.  There is an entry for each of the possible named style
    * types.
    */
  var styles: js.UndefOr[js.Array[Schema$NamedStyle]] = js.native
}

object Schema$NamedStyles {
  @scala.inline
  def apply(styles: js.Array[Schema$NamedStyle] = null): Schema$NamedStyles = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NamedStyles]
  }
}

