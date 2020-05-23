package typings.devexpressWeb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientWebDocumentViewerBrick extends js.Object {
  var content: StringDictionary[String]
  var height: Double
  var left: Double
  var navigation: ASPxClientWebDocumentViewerBrickNavigation
  var rtl: Boolean
  var top: Double
  var width: Double
}

object ASPxClientWebDocumentViewerBrick {
  @scala.inline
  def apply(
    content: StringDictionary[String],
    height: Double,
    left: Double,
    navigation: ASPxClientWebDocumentViewerBrickNavigation,
    rtl: Boolean,
    top: Double,
    width: Double
  ): ASPxClientWebDocumentViewerBrick = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebDocumentViewerBrick]
  }
}

