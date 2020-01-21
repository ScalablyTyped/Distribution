package typings.firebaseComponent

import typings.firebaseComponent.componentMod.Component
import typings.firebaseComponent.firebaseComponentStrings.badtest
import typings.firebaseComponent.firebaseComponentStrings.fireball
import typings.firebaseComponent.firebaseComponentStrings.rocket
import typings.firebaseComponent.firebaseComponentStrings.ship
import typings.firebaseComponent.firebaseComponentStrings.test
import typings.firebaseComponent.providerMod.Provider
import typings.firebaseComponent.typesMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/component/dist/src/component_container", JSImport.Namespace)
@js.native
object componentContainerMod extends js.Object {
  @js.native
  class ComponentContainer protected () extends js.Object {
    def this(name: String) = this()
    val name: js.Any = js.native
    val providers: js.Any = js.native
    @JSName("addComponent")
    def addComponent_badtest(component: Component[badtest]): Unit = js.native
    @JSName("addComponent")
    def addComponent_fireball(component: Component[fireball]): Unit = js.native
    /**
      *
      * @param component Component being added
      * @param overwrite When a component with the same name has already been registered,
      * if overwrite is true: overwrite the existing component with the new component and create a new
      * provider with the new component. It can be useful in tests where you want to use different mocks
      * for different tests.
      * if overwrite is false: throw an exception
      */
    @JSName("addComponent")
    def addComponent_rocket(component: Component[rocket]): Unit = js.native
    @JSName("addComponent")
    def addComponent_ship(component: Component[ship]): Unit = js.native
    @JSName("addComponent")
    def addComponent_test(component: Component[test]): Unit = js.native
    @JSName("addOrOverwriteComponent")
    def addOrOverwriteComponent_badtest(component: Component[badtest]): Unit = js.native
    @JSName("addOrOverwriteComponent")
    def addOrOverwriteComponent_fireball(component: Component[fireball]): Unit = js.native
    @JSName("addOrOverwriteComponent")
    def addOrOverwriteComponent_rocket(component: Component[rocket]): Unit = js.native
    @JSName("addOrOverwriteComponent")
    def addOrOverwriteComponent_ship(component: Component[ship]): Unit = js.native
    @JSName("addOrOverwriteComponent")
    def addOrOverwriteComponent_test(component: Component[test]): Unit = js.native
    @JSName("getProvider")
    def getProvider_badtest(name: badtest): Provider[badtest] = js.native
    @JSName("getProvider")
    def getProvider_fireball(name: fireball): Provider[fireball] = js.native
    /**
      * getProvider provides a type safe interface where it can only be called with a field name
      * present in NameServiceMapping interface.
      *
      * Firebase SDKs providing services should extend NameServiceMapping interface to register
      * themselves.
      */
    @JSName("getProvider")
    def getProvider_rocket(name: rocket): Provider[rocket] = js.native
    @JSName("getProvider")
    def getProvider_ship(name: ship): Provider[ship] = js.native
    @JSName("getProvider")
    def getProvider_test(name: test): Provider[test] = js.native
    def getProviders(): js.Array[Provider[Name]] = js.native
  }
  
}

