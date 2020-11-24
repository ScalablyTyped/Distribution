package typings.expoLinearGradient.anon

import typings.expoLinearGradient.nativeLinearGradientTypesMod.NativeLinearGradientPoint
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.PropsWithChildren<{  colors :std.Array<number>,   locations :std.Array<number> | null | undefined,   startPoint :expo-linear-gradient.expo-linear-gradient/build/NativeLinearGradient.types.NativeLinearGradientPoint | null | undefined,   endPoint :expo-linear-gradient.expo-linear-gradient/build/NativeLinearGradient.types.NativeLinearGradientPoint | null | undefined}> */
@js.native
trait PropsWithChildrencolorsAr extends js.Object {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var colors: js.Array[Double] = js.native
  
  var endPoint: js.UndefOr[NativeLinearGradientPoint | Null] = js.native
  
  var locations: js.UndefOr[js.Array[Double] | Null] = js.native
  
  var startPoint: js.UndefOr[NativeLinearGradientPoint | Null] = js.native
}
object PropsWithChildrencolorsAr {
  
  @scala.inline
  def apply(colors: js.Array[Double]): PropsWithChildrencolorsAr = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsWithChildrencolorsAr]
  }
  
  @scala.inline
  implicit class PropsWithChildrencolorsArOps[Self <: PropsWithChildrencolorsAr] (val x: Self) extends AnyVal {
    
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
    def setColorsVarargs(value: Double*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[Double]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setEndPoint(value: NativeLinearGradientPoint): Self = this.set("endPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndPoint: Self = this.set("endPoint", js.undefined)
    
    @scala.inline
    def setEndPointNull: Self = this.set("endPoint", null)
    
    @scala.inline
    def setLocationsVarargs(value: Double*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[Double]): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    
    @scala.inline
    def setLocationsNull: Self = this.set("locations", null)
    
    @scala.inline
    def setStartPoint(value: NativeLinearGradientPoint): Self = this.set("startPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartPoint: Self = this.set("startPoint", js.undefined)
    
    @scala.inline
    def setStartPointNull: Self = this.set("startPoint", null)
  }
}
