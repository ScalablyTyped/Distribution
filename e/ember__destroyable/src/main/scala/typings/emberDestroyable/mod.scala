package typings.emberDestroyable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ember/destroyable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertDestroyablesDestroyed(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDestroyablesDestroyed")().asInstanceOf[Unit]
  
  inline def associateDestroyableChild[T /* <: js.Object */](parent: js.Object, child: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("associateDestroyableChild")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def destroy(destroyable: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(destroyable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def enableDestroyableTracking(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableDestroyableTracking")().asInstanceOf[Unit]
  
  inline def isDestroyed(destroyable: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDestroyed")(destroyable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDestroying(destroyable: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDestroying")(destroyable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def registerDestructor[T /* <: js.Object */](destroyable: T, destructor: js.Function1[/* destroyable */ T, Unit]): js.Function1[/* destroyable */ T, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDestructor")(destroyable.asInstanceOf[js.Any], destructor.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* destroyable */ T, Unit]]
  
  inline def unregisterDestructor[T /* <: js.Object */](destroyable: T, destructor: js.Function1[/* destroyable */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterDestructor")(destroyable.asInstanceOf[js.Any], destructor.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
