package typings.glue

import typings.glue.anon.Plugins
import typings.hapi.mod.Server
import typings.hapi.mod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("glue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def compose(manifest: Manifest): js.Promise[Server] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(manifest.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Server]]
  @scala.inline
  def compose(manifest: Manifest, options: Options): js.Promise[Server] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(manifest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Server]]
  
  trait Manifest extends StObject {
    
    var register: js.UndefOr[Plugins] = js.undefined
    
    var server: ServerOptions
  }
  object Manifest {
    
    @scala.inline
    def apply(server: ServerOptions): Manifest = {
      val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[Manifest]
    }
    
    @scala.inline
    implicit class ManifestMutableBuilder[Self <: Manifest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegister(value: Plugins): Self = StObject.set(x, "register", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
      
      @scala.inline
      def setServer(value: ServerOptions): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var preConnections: js.UndefOr[
        js.Function2[/* Server */ Server, /* next */ js.Function1[/* err */ js.Any, Unit], Unit]
      ] = js.undefined
    
    var preRegister: js.UndefOr[
        js.Function2[/* Server */ Server, /* next */ js.Function1[/* err */ js.Any, Unit], Unit]
      ] = js.undefined
    
    var relativeTo: String
  }
  object Options {
    
    @scala.inline
    def apply(relativeTo: String): Options = {
      val __obj = js.Dynamic.literal(relativeTo = relativeTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPreConnections(value: (/* Server */ Server, /* next */ js.Function1[/* err */ js.Any, Unit]) => Unit): Self = StObject.set(x, "preConnections", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPreConnectionsUndefined: Self = StObject.set(x, "preConnections", js.undefined)
      
      @scala.inline
      def setPreRegister(value: (/* Server */ Server, /* next */ js.Function1[/* err */ js.Any, Unit]) => Unit): Self = StObject.set(x, "preRegister", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPreRegisterUndefined: Self = StObject.set(x, "preRegister", js.undefined)
      
      @scala.inline
      def setRelativeTo(value: String): Self = StObject.set(x, "relativeTo", value.asInstanceOf[js.Any])
    }
  }
  
  trait Plugin extends StObject {
    
    var options: js.UndefOr[js.Any] = js.undefined
    
    var plugin: String | typings.glue.anon.Options
    
    var routes: js.UndefOr[js.Any] = js.undefined
  }
  object Plugin {
    
    @scala.inline
    def apply(plugin: String | typings.glue.anon.Options): Plugin = {
      val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugin]
    }
    
    @scala.inline
    implicit class PluginMutableBuilder[Self <: Plugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPlugin(value: String | typings.glue.anon.Options): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutes(value: js.Any): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
    }
  }
}
