package typings.embroiderMacros

import org.scalablytyped.runtime.StringDictionary
import typings.babelTraverse.mod.NodePath
import typings.babelTypes.mod.CallExpression_
import typings.babelTypes.mod.Identifier_
import typings.babelTypes.mod.MemberExpression_
import typings.babelTypes.mod.Node
import typings.babelTypes.mod.ObjectExpression_
import typings.babelTypes.mod.OptionalMemberExpression_
import typings.embroiderMacros.anon.TypeofBabel
import typings.embroiderMacros.embroiderMacrosBooleans.`false`
import typings.embroiderMacros.embroiderMacrosBooleans.`true`
import typings.embroiderMacros.srcBabelStateMod.State
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBabelEvaluateJsonMod {
  
  @JSImport("@embroider/macros/src/babel/evaluate-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@embroider/macros/src/babel/evaluate-json", "Evaluator")
  @js.native
  open class Evaluator () extends StObject {
    def this(env: EvaluationEnv) = this()
    
    def evaluate(path: NodePath[Node]): EvaluateResult = js.native
    
    def evaluateKey(path: NodePath[Node]): EvaluateResult = js.native
    
    def evaluateMacroCall(path: NodePath[CallExpression_]): EvaluateResult = js.native
    
    def evaluateMember(path: NodePath[MemberExpression_ | OptionalMemberExpression_], optionalChain: Boolean): EvaluateResult = js.native
    
    /* private */ var knownPaths: Any = js.native
    
    /* private */ var locals: Any = js.native
    
    /* private */ var maybeEvaluateRuntimeConfig: Any = js.native
    
    /* private */ var realEvaluate: Any = js.native
    
    /* private */ var state: Any = js.native
  }
  
  inline def assertArray[T](input: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("assertArray")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def assertArray[T](input: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("assertArray")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def assertNotArray[T](input: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNotArray")(input.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def assertNotArray[T](input: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNotArray")(input.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def buildLiterals(value: Any, babelContext: TypeofBabel): Identifier_ | ObjectExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("buildLiterals")(value.asInstanceOf[js.Any], babelContext.asInstanceOf[js.Any])).asInstanceOf[Identifier_ | ObjectExpression_]
  inline def buildLiterals(value: Unit, babelContext: TypeofBabel): Identifier_ | ObjectExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("buildLiterals")(value.asInstanceOf[js.Any], babelContext.asInstanceOf[js.Any])).asInstanceOf[Identifier_ | ObjectExpression_]
  
  trait ConfidentResult
    extends StObject
       with EvaluateResult {
    
    var confident: `true`
    
    var value: Any
  }
  object ConfidentResult {
    
    inline def apply(value: Any): ConfidentResult = {
      val __obj = js.Dynamic.literal(confident = true, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfidentResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfidentResult] (val x: Self) extends AnyVal {
      
      inline def setConfident(value: `true`): Self = StObject.set(x, "confident", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.embroiderMacros.srcBabelEvaluateJsonMod.ConfidentResult
    - typings.embroiderMacros.srcBabelEvaluateJsonMod.UnknownResult
  */
  trait EvaluateResult extends StObject
  object EvaluateResult {
    
    inline def ConfidentResult(value: Any): typings.embroiderMacros.srcBabelEvaluateJsonMod.ConfidentResult = {
      val __obj = js.Dynamic.literal(confident = true, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.embroiderMacros.srcBabelEvaluateJsonMod.ConfidentResult]
    }
    
    inline def UnknownResult(): typings.embroiderMacros.srcBabelEvaluateJsonMod.UnknownResult = {
      val __obj = js.Dynamic.literal(confident = false)
      __obj.asInstanceOf[typings.embroiderMacros.srcBabelEvaluateJsonMod.UnknownResult]
    }
  }
  
  trait EvaluationEnv extends StObject {
    
    var knownPaths: js.UndefOr[Map[NodePath[Node], EvaluateResult]] = js.undefined
    
    var locals: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var state: js.UndefOr[State] = js.undefined
  }
  object EvaluationEnv {
    
    inline def apply(): EvaluationEnv = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EvaluationEnv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EvaluationEnv] (val x: Self) extends AnyVal {
      
      inline def setKnownPaths(value: Map[NodePath[Node], EvaluateResult]): Self = StObject.set(x, "knownPaths", value.asInstanceOf[js.Any])
      
      inline def setKnownPathsUndefined: Self = StObject.set(x, "knownPaths", js.undefined)
      
      inline def setLocals(value: StringDictionary[Any]): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
      
      inline def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait UnknownResult
    extends StObject
       with EvaluateResult {
    
    var confident: `false`
  }
  object UnknownResult {
    
    inline def apply(): UnknownResult = {
      val __obj = js.Dynamic.literal(confident = false)
      __obj.asInstanceOf[UnknownResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnknownResult] (val x: Self) extends AnyVal {
      
      inline def setConfident(value: `false`): Self = StObject.set(x, "confident", value.asInstanceOf[js.Any])
    }
  }
}
