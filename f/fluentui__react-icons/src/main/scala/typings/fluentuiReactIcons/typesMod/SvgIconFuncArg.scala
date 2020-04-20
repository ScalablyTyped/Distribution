package typings.fluentuiReactIcons.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgIconFuncArg[TProps] extends js.Object {
  var classes: StringDictionary[String]
  var props: TProps
}

object SvgIconFuncArg {
  @scala.inline
  def apply[TProps](classes: StringDictionary[String], props: TProps): SvgIconFuncArg[TProps] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgIconFuncArg[TProps]]
  }
}

