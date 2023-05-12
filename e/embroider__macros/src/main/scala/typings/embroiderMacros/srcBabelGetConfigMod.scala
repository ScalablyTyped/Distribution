package typings.embroiderMacros

import typings.babelTraverse.mod.NodePath
import typings.babelTypes.mod.CallExpression_
import typings.babelTypes.mod.FunctionDeclaration_
import typings.embroiderMacros.anon.TypeofBabel
import typings.embroiderMacros.srcBabelStateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBabelGetConfigMod {
  
  @JSImport("@embroider/macros/src/babel/get-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(path: NodePath[CallExpression_], state: State, mode: Mode): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], state.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def inlineRuntimeConfig(path: NodePath[FunctionDeclaration_], state: State, context: TypeofBabel): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inlineRuntimeConfig")(path.asInstanceOf[js.Any], state.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def insertConfig(path: NodePath[CallExpression_], state: State, mode: Mode, context: TypeofBabel): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertConfig")(path.asInstanceOf[js.Any], state.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.embroiderMacros.embroiderMacrosStrings.own
    - typings.embroiderMacros.embroiderMacrosStrings.getGlobalConfig
    - typings.embroiderMacros.embroiderMacrosStrings._package
  */
  trait Mode extends StObject
  object Mode {
    
    inline def _package: typings.embroiderMacros.embroiderMacrosStrings._package = "package".asInstanceOf[typings.embroiderMacros.embroiderMacrosStrings._package]
    
    inline def getGlobalConfig: typings.embroiderMacros.embroiderMacrosStrings.getGlobalConfig = "getGlobalConfig".asInstanceOf[typings.embroiderMacros.embroiderMacrosStrings.getGlobalConfig]
    
    inline def own: typings.embroiderMacros.embroiderMacrosStrings.own = "own".asInstanceOf[typings.embroiderMacros.embroiderMacrosStrings.own]
  }
}
