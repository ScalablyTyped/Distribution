package typings.ecmarkup.libFigureMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Builder * / any */ trait Figure extends js.Object {
  var caption: String
  var captionElem: HTMLElement | Null
  var id: String | Null
  var isInformative: Boolean
  var number: Double
  var `type`: String
}

object Figure {
  @scala.inline
  def apply(
    caption: String,
    isInformative: Boolean,
    number: Double,
    `type`: String,
    captionElem: HTMLElement = null,
    id: String = null
  ): Figure = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], isInformative = isInformative.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (captionElem != null) __obj.updateDynamic("captionElem")(captionElem.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Figure]
  }
}

