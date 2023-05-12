package typings.glimmerDi

import typings.glimmerDi.distTypesFactoryMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOwnerMod {
  
  @JSImport("@glimmer/di/dist/types/owner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@glimmer/di/dist/types/owner", "OWNER")
  @js.native
  val OWNER_ : /* "__owner__" */ String = js.native
  
  inline def getOwner(`object`: js.Object): Owner = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwner")(`object`.asInstanceOf[js.Any]).asInstanceOf[Owner]
  
  inline def setOwner(`object`: js.Object, owner: Owner): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOwner")(`object`.asInstanceOf[js.Any], owner.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait Owner extends StObject {
    
    def factoryFor(specifier: String): Factory[Any] = js.native
    def factoryFor(specifier: String, referrer: String): Factory[Any] = js.native
    
    def identify(specifier: String): String = js.native
    def identify(specifier: String, referrer: String): String = js.native
    
    def lookup(specifier: String): Any = js.native
    def lookup(specifier: String, referrer: String): Any = js.native
  }
}
