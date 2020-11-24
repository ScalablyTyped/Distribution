package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactStrings.s
import typings.react.mod.Validator
import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Tile/Tile.TileProps> */
@js.native
trait WeakValidationMapTileProp extends js.Object {
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var isDouble: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var onClick: js.UndefOr[
    Validator[
      js.UndefOr[
        (js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent], Unit]) | Null
      ]
    ]
  ] = js.native
  
  var size: js.UndefOr[Validator[js.UndefOr[s | Null]]] = js.native
}
object WeakValidationMapTileProp {
  
  @scala.inline
  def apply(): WeakValidationMapTileProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapTileProp]
  }
  
  @scala.inline
  implicit class WeakValidationMapTilePropOps[Self <: WeakValidationMapTileProp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setIsDouble(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("isDouble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDouble: Self = this.set("isDouble", js.undefined)
    
    @scala.inline
    def setOnClick(
      value: Validator[
          js.UndefOr[
            (js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent], Unit]) | Null
          ]
        ]
    ): Self = this.set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setSize(value: Validator[js.UndefOr[s | Null]]): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
