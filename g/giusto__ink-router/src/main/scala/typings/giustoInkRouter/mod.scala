package typings.giustoInkRouter

import typings.giustoInkRouter.anon.Hash
import typings.giustoInkRouter.anon.Key
import typings.giustoInkRouter.anon.Params
import typings.history.mod.History
import typings.history.mod.Location
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@giusto/ink-router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@giusto/ink-router", "CommandLineRouter")
  @js.native
  open class CommandLineRouter protected ()
    extends Component[CommandLineRouterProps, js.Object, Any] {
    def this(props: CommandLineRouterProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: CommandLineRouterProps, context: Any) = this()
  }
  
  @JSImport("@giusto/ink-router", "Route")
  @js.native
  open class Route protected ()
    extends Component[RouteProps, js.Object, Any] {
    def this(props: RouteProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: RouteProps, context: Any) = this()
  }
  
  @JSImport("@giusto/ink-router", "Router")
  @js.native
  open class Router protected ()
    extends Component[RouterProps, js.Object, Any] {
    def this(props: RouterProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: RouterProps, context: Any) = this()
  }
  
  @JSImport("@giusto/ink-router", "Switch")
  @js.native
  open class Switch protected ()
    extends Component[SwitchProps, js.Object, Any] {
    def this(props: SwitchProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: SwitchProps, context: Any) = this()
  }
  
  inline def withRouter(component: ComponentType[Any]): js.Function1[/* props */ Any, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("withRouter")(component.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ Any, Element]]
  
  trait CommandLineRouterProps extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    var children: NonNullable[ReactNode]
    
    var initialEntries: js.UndefOr[js.Array[String]] = js.undefined
    
    var initialIndex: js.UndefOr[Double] = js.undefined
    
    var options: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object CommandLineRouterProps {
    
    inline def apply(): CommandLineRouterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandLineRouterProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandLineRouterProps] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setChildren(value: NonNullable[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialEntries(value: js.Array[String]): Self = StObject.set(x, "initialEntries", value.asInstanceOf[js.Any])
      
      inline def setInitialEntriesUndefined: Self = StObject.set(x, "initialEntries", js.undefined)
      
      inline def setInitialEntriesVarargs(value: String*): Self = StObject.set(x, "initialEntries", js.Array(value*))
      
      inline def setInitialIndex(value: Double): Self = StObject.set(x, "initialIndex", value.asInstanceOf[js.Any])
      
      inline def setInitialIndexUndefined: Self = StObject.set(x, "initialIndex", js.undefined)
      
      inline def setOptions(value: Record[String, Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait RouteComponentProps[T /* <: Record[String, Any] */] extends StObject {
    
    var history: History
    
    var location: Location
    
    var `match`: Params[T]
  }
  object RouteComponentProps {
    
    inline def apply[T /* <: Record[String, Any] */](history: History, location: Location, `match`: Params[T]): RouteComponentProps[T] = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteComponentProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouteComponentProps[?], T /* <: Record[String, Any] */] (val x: Self & RouteComponentProps[T]) extends AnyVal {
      
      inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: Params[T]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteProps extends StObject {
    
    var component: ComponentType[Any]
    
    var exact: js.UndefOr[Boolean] = js.undefined
    
    var location: js.UndefOr[Key] = js.undefined
    
    var path: String
  }
  object RouteProps {
    
    inline def apply(component: ComponentType[Any], path: String): RouteProps = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouteProps] (val x: Self) extends AnyVal {
      
      inline def setComponent(value: ComponentType[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      inline def setLocation(value: Key): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouterProps extends StObject {
    
    var children: NonNullable[ReactNode]
    
    var getUserConfirmation: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var initialEntries: js.UndefOr[js.Array[String | Hash]] = js.undefined
    
    var initialIndex: js.UndefOr[Double] = js.undefined
    
    var keyLength: js.UndefOr[Double] = js.undefined
  }
  object RouterProps {
    
    inline def apply(): RouterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouterProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouterProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: NonNullable[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setGetUserConfirmation(value: () => Unit): Self = StObject.set(x, "getUserConfirmation", js.Any.fromFunction0(value))
      
      inline def setGetUserConfirmationUndefined: Self = StObject.set(x, "getUserConfirmation", js.undefined)
      
      inline def setInitialEntries(value: js.Array[String | Hash]): Self = StObject.set(x, "initialEntries", value.asInstanceOf[js.Any])
      
      inline def setInitialEntriesUndefined: Self = StObject.set(x, "initialEntries", js.undefined)
      
      inline def setInitialEntriesVarargs(value: (String | Hash)*): Self = StObject.set(x, "initialEntries", js.Array(value*))
      
      inline def setInitialIndex(value: Double): Self = StObject.set(x, "initialIndex", value.asInstanceOf[js.Any])
      
      inline def setInitialIndexUndefined: Self = StObject.set(x, "initialIndex", js.undefined)
      
      inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
      
      inline def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    }
  }
  
  trait SwitchProps extends StObject {
    
    var children: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.undefined
    
    var notFound: js.UndefOr[js.Function0[Any] | ComponentType[Any]] = js.undefined
  }
  object SwitchProps {
    
    inline def apply(): SwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwitchProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setNotFound(value: js.Function0[Any] | ComponentType[Any]): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
      
      inline def setNotFoundFunction0(value: () => Any): Self = StObject.set(x, "notFound", js.Any.fromFunction0(value))
      
      inline def setNotFoundUndefined: Self = StObject.set(x, "notFound", js.undefined)
    }
  }
}
