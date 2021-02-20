package typings.emberEngine

import typings.emberEngine.initializerMod.Initializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ember/engine", JSImport.Default)
  @js.native
  class default () extends Engine
  /* static members */
  object default {
    
    /**
      * The goal of initializers should be to register dependencies and injections.
      * This phase runs once. Because these initializers may load code, they are
      * allowed to defer application readiness and advance it. If you need to access
      * the container or store you should use an InstanceInitializer that will be run
      * after all initializers and therefore after all code is loaded and the app is
      * ready.
      */
    @JSImport("@ember/engine", "default.initializer")
    @js.native
    def initializer(initializer: Initializer[Engine]): Unit = js.native
    
    /**
      * Instance initializers run after all initializers have run. Because
      * instance initializers run after the app is fully set up. We have access
      * to the store, container, and other items. However, these initializers run
      * after code has loaded and are not allowed to defer readiness.
      */
    @JSImport("@ember/engine", "default.instanceInitializer")
    @js.native
    def instanceInitializer(instanceInitializer: Initializer[typings.emberEngine.instanceMod.default]): Unit = js.native
  }
  
  @JSImport("@ember/engine", "getEngineParent")
  @js.native
  def getEngineParent(engine: typings.emberEngine.instanceMod.default): typings.emberEngine.instanceMod.default = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: parser.TsParser#tsDeclClass functionCall class extends from : EmberObject.extend(RegistryProxyMixin) * / any */ @js.native
  trait Engine extends StObject {
    
    /**
      * Create an EngineInstance for this Engine.
      */
    def buildInstance(): typings.emberEngine.instanceMod.default = js.native
    def buildInstance(options: js.Object): typings.emberEngine.instanceMod.default = js.native
    
    /**
      * Set this to provide an alternate class to `Ember.DefaultResolver`
      */
    var resolver: typings.emberEngine.resolverMod.default = js.native
  }
}
