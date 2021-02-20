package typings.giustoInkRouter

import typings.giustoInkRouter.anon.Hash
import typings.giustoInkRouter.anon.Key
import typings.giustoInkRouter.anon.Params
import typings.history.mod.History
import typings.history.mod.Location
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@giusto/ink-router", "CommandLineRouter")
  @js.native
  class CommandLineRouter protected ()
    extends Component[CommandLineRouterProps, js.Object, js.Any] {
    def this(props: CommandLineRouterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CommandLineRouterProps, context: js.Any) = this()
  }
  
  @JSImport("@giusto/ink-router", "Route")
  @js.native
  class Route protected ()
    extends Component[RouteProps, js.Object, js.Any] {
    def this(props: RouteProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RouteProps, context: js.Any) = this()
  }
  
  @JSImport("@giusto/ink-router", "Router")
  @js.native
  class Router protected ()
    extends Component[RouterProps, js.Object, js.Any] {
    def this(props: RouterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RouterProps, context: js.Any) = this()
  }
  
  @JSImport("@giusto/ink-router", "Switch")
  @js.native
  class Switch protected ()
    extends Component[SwitchProps, js.Object, js.Any] {
    def this(props: SwitchProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SwitchProps, context: js.Any) = this()
  }
  
  @JSImport("@giusto/ink-router", "withRouter")
  @js.native
  def withRouter(component: ComponentType[_]): js.Function1[/* props */ js.Any, Element] = js.native
  
  @js.native
  trait CommandLineRouterProps extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.native
    
    var initialEntries: js.UndefOr[js.Array[String]] = js.native
    
    var initialIndex: js.UndefOr[Double] = js.native
    
    var options: js.UndefOr[Record[String, _]] = js.native
  }
  object CommandLineRouterProps {
    
    @scala.inline
    def apply(): CommandLineRouterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandLineRouterProps]
    }
    
    @scala.inline
    implicit class CommandLineRouterPropsMutableBuilder[Self <: CommandLineRouterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setInitialEntries(value: js.Array[String]): Self = StObject.set(x, "initialEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialEntriesUndefined: Self = StObject.set(x, "initialEntries", js.undefined)
      
      @scala.inline
      def setInitialEntriesVarargs(value: String*): Self = StObject.set(x, "initialEntries", js.Array(value :_*))
      
      @scala.inline
      def setInitialIndex(value: Double): Self = StObject.set(x, "initialIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialIndexUndefined: Self = StObject.set(x, "initialIndex", js.undefined)
      
      @scala.inline
      def setOptions(value: Record[String, _]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  @js.native
  trait RouteComponentProps[T /* <: Record[String, _] */] extends StObject {
    
    var history: History[js.Object] = js.native
    
    var location: Location[js.Object] = js.native
    
    var `match`: Params[T] = js.native
  }
  object RouteComponentProps {
    
    @scala.inline
    def apply[T /* <: Record[String, _] */](history: History[js.Object], location: Location[js.Object], `match`: Params[T]): RouteComponentProps[T] = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteComponentProps[T]]
    }
    
    @scala.inline
    implicit class RouteComponentPropsMutableBuilder[Self <: RouteComponentProps[_], T /* <: Record[String, _] */] (val x: Self with RouteComponentProps[T]) extends AnyVal {
      
      @scala.inline
      def setHistory(value: History[js.Object]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: Location[js.Object]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatch(value: Params[T]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RouteProps extends StObject {
    
    var component: ComponentType[_] = js.native
    
    var exact: js.UndefOr[Boolean] = js.native
    
    var location: js.UndefOr[Key] = js.native
    
    var path: String = js.native
  }
  object RouteProps {
    
    @scala.inline
    def apply(component: ComponentType[_], path: String): RouteProps = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteProps]
    }
    
    @scala.inline
    implicit class RoutePropsMutableBuilder[Self <: RouteProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: ComponentType[_]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      @scala.inline
      def setLocation(value: Key): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RouterProps extends StObject {
    
    var getUserConfirmation: js.UndefOr[js.Function0[Unit]] = js.native
    
    var initialEntries: js.UndefOr[js.Array[String | Hash]] = js.native
    
    var initialIndex: js.UndefOr[Double] = js.native
    
    var keyLength: js.UndefOr[Double] = js.native
  }
  object RouterProps {
    
    @scala.inline
    def apply(): RouterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouterProps]
    }
    
    @scala.inline
    implicit class RouterPropsMutableBuilder[Self <: RouterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetUserConfirmation(value: () => Unit): Self = StObject.set(x, "getUserConfirmation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUserConfirmationUndefined: Self = StObject.set(x, "getUserConfirmation", js.undefined)
      
      @scala.inline
      def setInitialEntries(value: js.Array[String | Hash]): Self = StObject.set(x, "initialEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialEntriesUndefined: Self = StObject.set(x, "initialEntries", js.undefined)
      
      @scala.inline
      def setInitialEntriesVarargs(value: (String | Hash)*): Self = StObject.set(x, "initialEntries", js.Array(value :_*))
      
      @scala.inline
      def setInitialIndex(value: Double): Self = StObject.set(x, "initialIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialIndexUndefined: Self = StObject.set(x, "initialIndex", js.undefined)
      
      @scala.inline
      def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    }
  }
  
  @js.native
  trait SwitchProps extends StObject {
    
    var children: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.native
    
    var notFound: js.UndefOr[js.Function0[_] | ComponentType[_]] = js.native
  }
  object SwitchProps {
    
    @scala.inline
    def apply(): SwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchProps]
    }
    
    @scala.inline
    implicit class SwitchPropsMutableBuilder[Self <: SwitchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setNotFound(value: js.Function0[_] | ComponentType[_]): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundFunction0(value: () => _): Self = StObject.set(x, "notFound", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotFoundUndefined: Self = StObject.set(x, "notFound", js.undefined)
    }
  }
}
