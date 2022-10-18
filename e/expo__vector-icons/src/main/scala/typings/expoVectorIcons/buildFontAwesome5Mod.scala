package typings.expoVectorIcons

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFontAwesome5Mod extends Shortcut {
  
  @JSImport("@expo/vector-icons/build/FontAwesome5", JSImport.Default)
  @js.native
  val default: Any = js.native
  
  object FA5Style {
    
    @JSImport("@expo/vector-icons/build/FontAwesome5", "FA5Style")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@expo/vector-icons/build/FontAwesome5", "FA5Style.brand")
    @js.native
    def brand: String = js.native
    inline def brand_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brand")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/vector-icons/build/FontAwesome5", "FA5Style.light")
    @js.native
    def light: String = js.native
    inline def light_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("light")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/vector-icons/build/FontAwesome5", "FA5Style.regular")
    @js.native
    def regular: String = js.native
    inline def regular_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regular")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/vector-icons/build/FontAwesome5", "FA5Style.solid")
    @js.native
    def solid: String = js.native
    inline def solid_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("solid")(x.asInstanceOf[js.Any])
  }
  
  type _To = Any
  
  /* This means you don't have to write `default`, but can instead just say `buildFontAwesome5Mod.foo` */
  override def _to: Any = default
}
