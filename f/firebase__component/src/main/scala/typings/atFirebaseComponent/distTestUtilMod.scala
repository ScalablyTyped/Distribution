package typings.atFirebaseComponent

import typings.atFirebaseComponent.atFirebaseComponentStrings.badtest
import typings.atFirebaseComponent.atFirebaseComponentStrings.fireball
import typings.atFirebaseComponent.atFirebaseComponentStrings.rocket
import typings.atFirebaseComponent.atFirebaseComponentStrings.ship
import typings.atFirebaseComponent.atFirebaseComponentStrings.test
import typings.atFirebaseComponent.distSrcComponentMod.Component
import typings.atFirebaseComponent.distSrcTypesMod.InstanceFactory
import typings.atFirebaseComponent.distSrcTypesMod.InstantiationMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/component/dist/test/util", JSImport.Namespace)
@js.native
object distTestUtilMod extends js.Object {
  def getFakeApp(): js.Any = js.native
  def getFakeApp(appName: String): js.Any = js.native
  @JSName("getFakeComponent")
  def getFakeComponent_badtest(name: badtest, factory: InstanceFactory[badtest]): Component[badtest] = js.native
  @JSName("getFakeComponent")
  def getFakeComponent_badtest(name: badtest, factory: InstanceFactory[badtest], multipleInstance: Boolean): Component[badtest] = js.native
  @JSName("getFakeComponent")
  def getFakeComponent_badtest(
    name: badtest,
    factory: InstanceFactory[badtest],
    multipleInstance: Boolean,
    instantiationMode: InstantiationMode
  ): Component[badtest] = js.native
  @JSName("getFakeComponent")
  def getFakeComponent_fireball(name: fireball, factory: InstanceFactory[fireball]): Component[fireball] = js.native
  @JSName("getFakeComponent")
  def getFakeComponent_fireball(name: fireball, factory: InstanceFactory[fireball], multipleInstance: Boolean): Component[fireball] = js.native
  @JSName("getFakeComponent")
  def getFakeComponent_fireball(
    name: fireball,
    factory: InstanceFactory[fireball],
    multipleInstance: Boolean,
    instantiationMode: InstantiationMode
  ): Component[fireball] = js.native
  @JSName("getFakeComponent")
  def getFakeComponent_rocket(name: rocket, factory: InstanceFactory[rocket]): Component[rocket] = js.native
  @JSName("getFakeComponent")
  def getFakeComponent_rocket(name: rocket, factory: InstanceFactory[rocket], multipleInstance: Boolean): Component[rocket] = js.native
  @JSName("getFakeComponent")
  def getFakeComponent_rocket(
    name: rocket,
    factory: InstanceFactory[rocket],
    multipleInstance: Boolean,
    instantiationMode: InstantiationMode
  ): Component[rocket] = js.native
  @JSName("getFakeComponent")
  def getFakeComponent_ship(name: ship, factory: InstanceFactory[ship]): Component[ship] = js.native
  @JSName("getFakeComponent")
  def getFakeComponent_ship(name: ship, factory: InstanceFactory[ship], multipleInstance: Boolean): Component[ship] = js.native
  @JSName("getFakeComponent")
  def getFakeComponent_ship(
    name: ship,
    factory: InstanceFactory[ship],
    multipleInstance: Boolean,
    instantiationMode: InstantiationMode
  ): Component[ship] = js.native
  @JSName("getFakeComponent")
  def getFakeComponent_test(name: test, factory: InstanceFactory[test]): Component[test] = js.native
  @JSName("getFakeComponent")
  def getFakeComponent_test(name: test, factory: InstanceFactory[test], multipleInstance: Boolean): Component[test] = js.native
  @JSName("getFakeComponent")
  def getFakeComponent_test(
    name: test,
    factory: InstanceFactory[test],
    multipleInstance: Boolean,
    instantiationMode: InstantiationMode
  ): Component[test] = js.native
}

