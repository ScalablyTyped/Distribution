package typings.f1

import typings.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): F1 = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[F1]
  inline def apply(settings: F1Options): F1 = ^.asInstanceOf[js.Dynamic].apply(settings.asInstanceOf[js.Any]).asInstanceOf[F1]
  
  @JSImport("f1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait F1
    extends StObject
       with EventEmitter {
    
    @JSName("apply")
    def apply(pathToTarget: String, target: Any, parserDefinition: Any): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def go(state: String): F1 = js.native
    def go(state: String, callback: js.Function2[/* state */ Any, /* currentState */ Any, Unit]): F1 = js.native
    
    def init(initState: String): F1 = js.native
    
    def parsers(parser: Any): F1 = js.native
    
    def set(state: String): F1 = js.native
    
    def states(states: Any): F1 = js.native
    
    def step(deltaTime: Double): F1 = js.native
    
    def targets(targets: Any): F1 = js.native
    
    def transitions(transitions: js.Array[Any]): F1 = js.native
    
    def update(): F1 = js.native
  }
  
  trait F1Options extends StObject {
    
    var name: String
    
    var onState: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var onUpdate: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var parsers: Any
    
    var states: Any
    
    var targets: Any
    
    var transitions: js.Array[Any]
  }
  object F1Options {
    
    inline def apply(name: String, parsers: Any, states: Any, targets: Any, transitions: js.Array[Any]): F1Options = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parsers = parsers.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any])
      __obj.asInstanceOf[F1Options]
    }
    
    extension [Self <: F1Options](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnState(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onState", js.Any.fromFunction1(value))
      
      inline def setOnStateUndefined: Self = StObject.set(x, "onState", js.undefined)
      
      inline def setOnUpdate(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setParsers(value: Any): Self = StObject.set(x, "parsers", value.asInstanceOf[js.Any])
      
      inline def setStates(value: Any): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
      
      inline def setTargets(value: Any): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTransitions(value: js.Array[Any]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      inline def setTransitionsVarargs(value: Any*): Self = StObject.set(x, "transitions", js.Array(value*))
    }
  }
}
