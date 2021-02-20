package typings.f1

import typings.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("f1", JSImport.Namespace)
  @js.native
  def apply(): F1 = js.native
  @JSImport("f1", JSImport.Namespace)
  @js.native
  def apply(settings: F1Options): F1 = js.native
  
  @js.native
  trait F1 extends EventEmitter {
    
    @JSName("apply")
    def apply(pathToTarget: String, target: js.Any, parserDefinition: js.Any): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def go(state: String): F1 = js.native
    def go(state: String, callback: js.Function2[/* state */ js.Any, /* currentState */ js.Any, Unit]): F1 = js.native
    
    def init(initState: String): F1 = js.native
    
    def parsers(parser: js.Any): F1 = js.native
    
    def set(state: String): F1 = js.native
    
    def states(states: js.Any): F1 = js.native
    
    def step(deltaTime: Double): F1 = js.native
    
    def targets(targets: js.Any): F1 = js.native
    
    def transitions(transitions: js.Array[_]): F1 = js.native
    
    def update(): F1 = js.native
  }
  
  @js.native
  trait F1Options extends StObject {
    
    var name: String = js.native
    
    var onState: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var onUpdate: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var parsers: js.Any = js.native
    
    var states: js.Any = js.native
    
    var targets: js.Any = js.native
    
    var transitions: js.Array[_] = js.native
  }
  object F1Options {
    
    @scala.inline
    def apply(name: String, parsers: js.Any, states: js.Any, targets: js.Any, transitions: js.Array[_]): F1Options = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parsers = parsers.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any])
      __obj.asInstanceOf[F1Options]
    }
    
    @scala.inline
    implicit class F1OptionsMutableBuilder[Self <: F1Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnState(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStateUndefined: Self = StObject.set(x, "onState", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setParsers(value: js.Any): Self = StObject.set(x, "parsers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStates(value: js.Any): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargets(value: js.Any): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitions(value: js.Array[_]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionsVarargs(value: js.Any*): Self = StObject.set(x, "transitions", js.Array(value :_*))
    }
  }
}
