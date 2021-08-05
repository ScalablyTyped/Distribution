package typings.eggMock

import org.scalablytyped.runtime.Shortcut
import typings.egg.mod.Application
import typings.egg.mod.Context
import typings.eggMock.anon.Data
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("egg-mock", JSImport.Namespace)
  @js.native
  val ^ : EggMock = js.native
  
  @js.native
  trait EggMock extends StObject {
    
    /**
      * Create a egg mocked application
      */
    def app(): MockApplication = js.native
    def app(option: MockOption): MockApplication = js.native
    
    /**
      * mock console level
      */
    def consoleLevel(level: String): Unit = js.native
    
    /**
      * mock the serverEnv of Egg
      */
    def env(env: EnvType): Unit = js.native
    
    /**
      * set EGG_HOME path
      */
    def home(homePath: String): Unit = js.native
    
    /**
      * restore mock
      */
    def restore(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.eggMock.eggMockStrings.default
    - typings.eggMock.eggMockStrings.test
    - typings.eggMock.eggMockStrings.prod
    - typings.eggMock.eggMockStrings.local
    - typings.eggMock.eggMockStrings.unittest
  */
  trait EnvType extends StObject
  object EnvType {
    
    inline def default: typings.eggMock.eggMockStrings.default = "default".asInstanceOf[typings.eggMock.eggMockStrings.default]
    
    inline def local: typings.eggMock.eggMockStrings.local = "local".asInstanceOf[typings.eggMock.eggMockStrings.local]
    
    inline def prod: typings.eggMock.eggMockStrings.prod = "prod".asInstanceOf[typings.eggMock.eggMockStrings.prod]
    
    inline def test: typings.eggMock.eggMockStrings.test = "test".asInstanceOf[typings.eggMock.eggMockStrings.test]
    
    inline def unittest: typings.eggMock.eggMockStrings.unittest = "unittest".asInstanceOf[typings.eggMock.eggMockStrings.unittest]
  }
  
  @js.native
  trait MockApplication extends Application {
    
    /**
      * mock Context
      */
    def mockContext(): Context = js.native
    def mockContext(data: js.Any): Context = js.native
    
    def mockCookies(cookies: js.Any): MockApplication = js.native
    
    def mockHeaders(headers: js.Any): MockApplication = js.native
    
    def mockHttpclient(mockUrl: String, mockMethod: String, mockResult: Data): MockApplication = js.native
    def mockHttpclient(mockUrl: String, mockMethod: js.Array[String], mockResult: Data): MockApplication = js.native
    
    /**
      * Mock service
      */
    def mockService(service: String, methodName: String, fn: js.Any): MockApplication = js.native
    
    /**
      * mock service that return error
      */
    def mockServiceError(service: String, methodName: String): MockApplication = js.native
    def mockServiceError(service: String, methodName: String, err: Error): MockApplication = js.native
    
    /**
      * mock cookie session
      */
    def mockSession(data: js.Any): MockApplication = js.native
  }
  
  trait MockOption extends StObject {
    
    /**
      * The directory of the application
      */
    var baseDir: js.UndefOr[String] = js.undefined
    
    /**
      * Cache application based on baseDir
      */
    var cache: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Remove $baseDir/logs
      */
    var clean: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Swtich on process coverage, but it'll be slower
      */
    var coverage: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The directory of the egg framework
      */
    var framework: js.UndefOr[String] = js.undefined
    
    /**
      * Custom you plugins
      */
    var plugins: js.UndefOr[js.Any] = js.undefined
  }
  object MockOption {
    
    inline def apply(): MockOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockOption]
    }
    
    extension [Self <: MockOption](x: Self) {
      
      inline def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
      inline def setBaseDirUndefined: Self = StObject.set(x, "baseDir", js.undefined)
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setClean(value: Boolean): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
      
      inline def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
      
      inline def setCoverage(value: Boolean): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
      
      inline def setCoverageUndefined: Self = StObject.set(x, "coverage", js.undefined)
      
      inline def setFramework(value: String): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
      
      inline def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
      
      inline def setPlugins(value: js.Any): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    }
  }
  
  type _To = EggMock
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: EggMock = ^
}
