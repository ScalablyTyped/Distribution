package typings.drupalAttribute

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("drupal-attribute", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DrupalAttribute {
    def this(it: Any) = this()
  }
  
  @js.native
  trait DrupalAttribute
    extends StObject
       with Map[
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for K */ Any, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for V */ Any
        ] {
    
    def addClass(args: String*): this.type = js.native
    
    def hasClass(value: String): Boolean = js.native
    
    def removeAttribute(key: String): this.type = js.native
    
    def removeClass(value: String): this.type = js.native
    
    def setAttribute(key: String, value: String): this.type = js.native
  }
}
