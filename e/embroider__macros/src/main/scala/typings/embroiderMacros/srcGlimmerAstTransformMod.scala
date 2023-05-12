package typings.embroiderMacros

import org.scalablytyped.runtime.StringDictionary
import typings.embroiderMacros.anon.BaseDir
import typings.embroiderMacros.anon.Filename
import typings.embroiderMacros.anon.Name
import typings.embroiderMacros.anon.Syntax
import typings.embroiderMacros.anon.Visitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGlimmerAstTransformMod {
  
  @JSImport("@embroider/macros/src/glimmer/ast-transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildPlugin(params: BuildPluginParams): BaseDir = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPlugin")(params.asInstanceOf[js.Any]).asInstanceOf[BaseDir]
  
  inline def makeFirstTransform(opts: FirstTransformParams): js.Function1[/* env */ Filename, Name] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeFirstTransform")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* env */ Filename, Name]]
  
  inline def makeSecondTransform(): js.Function1[/* env */ Syntax, Visitor] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSecondTransform")().asInstanceOf[js.Function1[/* env */ Syntax, Visitor]]
  
  trait BuildPluginParams extends StObject {
    
    var baseDir: String
    
    var firstTransformParams: FirstTransformParams
    
    var methodName: String
    
    var name: String
  }
  object BuildPluginParams {
    
    inline def apply(baseDir: String, firstTransformParams: FirstTransformParams, methodName: String, name: String): BuildPluginParams = {
      val __obj = js.Dynamic.literal(baseDir = baseDir.asInstanceOf[js.Any], firstTransformParams = firstTransformParams.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildPluginParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BuildPluginParams] (val x: Self) extends AnyVal {
      
      inline def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
      inline def setFirstTransformParams(value: FirstTransformParams): Self = StObject.set(x, "firstTransformParams", value.asInstanceOf[js.Any])
      
      inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FirstTransformParams extends StObject {
    
    var appRoot: String
    
    var configs: StringDictionary[js.Object]
    
    var packageRoot: js.UndefOr[String] = js.undefined
  }
  object FirstTransformParams {
    
    inline def apply(appRoot: String, configs: StringDictionary[js.Object]): FirstTransformParams = {
      val __obj = js.Dynamic.literal(appRoot = appRoot.asInstanceOf[js.Any], configs = configs.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirstTransformParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FirstTransformParams] (val x: Self) extends AnyVal {
      
      inline def setAppRoot(value: String): Self = StObject.set(x, "appRoot", value.asInstanceOf[js.Any])
      
      inline def setConfigs(value: StringDictionary[js.Object]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
      
      inline def setPackageRoot(value: String): Self = StObject.set(x, "packageRoot", value.asInstanceOf[js.Any])
      
      inline def setPackageRootUndefined: Self = StObject.set(x, "packageRoot", js.undefined)
    }
  }
}
