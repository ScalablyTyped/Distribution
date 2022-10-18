package typings.expressHandlebars

import typings.expressHandlebars.distExpressHandlebarsMod.default
import typings.expressHandlebars.typesMod.ConfigOptions
import typings.expressHandlebars.typesMod.Engine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("express-handlebars/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("express-handlebars/dist", "ExpressHandlebars")
  @js.native
  open class ExpressHandlebars () extends default {
    def this(config: ConfigOptions) = this()
  }
  
  inline def create(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[default]
  inline def create(config: ConfigOptions): default = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[default]
  
  inline def engine(): Engine = ^.asInstanceOf[js.Dynamic].applyDynamic("engine")().asInstanceOf[Engine]
  inline def engine(config: ConfigOptions): Engine = ^.asInstanceOf[js.Dynamic].applyDynamic("engine")(config.asInstanceOf[js.Any]).asInstanceOf[Engine]
}
