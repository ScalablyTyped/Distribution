package typings.gestalt.mod

import typings.gestalt.gestaltNumbers.`1`
import typings.gestalt.gestaltNumbers.`2`
import typings.gestalt.gestaltNumbers.`3`
import typings.gestalt.gestaltNumbers.`4`
import typings.gestalt.gestaltNumbers.`5`
import typings.gestalt.gestaltNumbers.`6`
import typings.gestalt.gestaltStrings.blue
import typings.gestalt.gestaltStrings.breakWord
import typings.gestalt.gestaltStrings.center
import typings.gestalt.gestaltStrings.darkGray
import typings.gestalt.gestaltStrings.eggplant
import typings.gestalt.gestaltStrings.gray
import typings.gestalt.gestaltStrings.green
import typings.gestalt.gestaltStrings.justify
import typings.gestalt.gestaltStrings.left
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.lightGray
import typings.gestalt.gestaltStrings.maroon
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.midnight
import typings.gestalt.gestaltStrings.navy
import typings.gestalt.gestaltStrings.normal
import typings.gestalt.gestaltStrings.olive
import typings.gestalt.gestaltStrings.orange
import typings.gestalt.gestaltStrings.orchid
import typings.gestalt.gestaltStrings.pine
import typings.gestalt.gestaltStrings.purple
import typings.gestalt.gestaltStrings.red
import typings.gestalt.gestaltStrings.right
import typings.gestalt.gestaltStrings.sm
import typings.gestalt.gestaltStrings.watermelon
import typings.gestalt.gestaltStrings.white
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderProps extends StObject {
  
  var accessibilityLevel: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  
  var align: js.UndefOr[left | right | center | justify] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var color: js.UndefOr[
    blue | darkGray | eggplant | gray | green | lightGray | maroon | midnight | navy | olive | orange | orchid | pine | purple | red | watermelon | white
  ] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var overflow: js.UndefOr[normal | breakWord] = js.undefined
  
  var size: js.UndefOr[sm | md | lg] = js.undefined
  
  var truncate: js.UndefOr[Boolean] = js.undefined
}
object HeaderProps {
  
  @scala.inline
  def apply(): HeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderProps]
  }
  
  @scala.inline
  implicit class HeaderPropsMutableBuilder[Self <: HeaderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLevel(value: `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "accessibilityLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLevelUndefined: Self = StObject.set(x, "accessibilityLevel", js.undefined)
    
    @scala.inline
    def setAlign(value: left | right | center | justify): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setColor(
      value: blue | darkGray | eggplant | gray | green | lightGray | maroon | midnight | navy | olive | orange | orchid | pine | purple | red | watermelon | white
    ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setOverflow(value: normal | breakWord): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    @scala.inline
    def setSize(value: sm | md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTruncate(value: Boolean): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
  }
}
