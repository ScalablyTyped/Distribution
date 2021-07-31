package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactStrings.ListDotText
import typings.fundamentalReact.listMod.ListTextProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListTextProps> & {  displayName :'List.Text'} */
@js.native
trait FunctionComponentListText extends StObject {
  
  def apply(props: PropsWithChildren[ListTextProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ListTextProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  
  var defaultProps: js.UndefOr[PartialListTextProps] = js.native
  
  var displayName: js.UndefOr[String] & ListDotText = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapListText] = js.native
}
