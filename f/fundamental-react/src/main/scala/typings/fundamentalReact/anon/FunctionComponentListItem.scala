package typings.fundamentalReact.anon

import typings.fundamentalReact.libListListMod.ListItemProps
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListItemProps> & {  displayName :'List.Item'} */
@js.native
trait FunctionComponentListItem extends StObject {
  
  def apply(props: ListItemProps): ReactElement | Null = js.native
  def apply(props: ListItemProps, context: Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var defaultProps: js.UndefOr[PartialListItemProps] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapListItem] = js.native
}
