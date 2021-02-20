package typings.glue

import typings.glue.anon.Plugins
import typings.hapi.mod.Server
import typings.hapi.mod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("glue", "compose")
  @js.native
  def compose(manifest: Manifest): js.Promise[Server] = js.native
  @JSImport("glue", "compose")
  @js.native
  def compose(manifest: Manifest, options: Options): js.Promise[Server] = js.native
  
  @js.native
  trait Manifest extends StObject {
    
    var register: js.UndefOr[Plugins] = js.native
    
    var server: ServerOptions = js.native
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
  
  @js.native
  trait Options extends StObject {
    
    var preConnections: js.UndefOr[
        js.Function2[/* Server */ Server, /* next */ js.Function1[/* err */ js.Any, Unit], Unit]
      ] = js.native
    
    var preRegister: js.UndefOr[
        js.Function2[/* Server */ Server, /* next */ js.Function1[/* err */ js.Any, Unit], Unit]
      ] = js.native
    
    var relativeTo: String = js.native
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
  
  @js.native
  trait Plugin extends StObject {
    
    var options: js.UndefOr[js.Any] = js.native
    
    var plugin: String | typings.glue.anon.Options = js.native
    
    var routes: js.UndefOr[js.Any] = js.native
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
