package typings
package gamequeryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  var gQ: GameQuery = js.native
  def addGroup(name: java.lang.String, options: GroupOptions): JQuery = js.native
  def addSprite(name: java.lang.String, options: SpriteOptions): JQuery = js.native
  def addTilemap(
    name: java.lang.String,
    tileDescription: js.Array[js.Array[scala.Double]],
    animationList: js.Array[Animation],
    options: TileMapOptions
  ): JQuery = js.native
  def addTilemap(
    name: java.lang.String,
    tileDescription: js.Array[js.Array[scala.Double]],
    animation: Animation,
    options: TileMapOptions
  ): JQuery = js.native
  def addTilemap(
    name: java.lang.String,
    tileDescription: js.Function2[/* i */ scala.Double, /* j */ scala.Double, scala.Double],
    animationList: js.Array[Animation],
    options: TileMapOptions
  ): JQuery = js.native
  def addTilemap(
    name: java.lang.String,
    tileDescription: js.Function2[/* i */ scala.Double, /* j */ scala.Double, scala.Double],
    animation: Animation,
    options: TileMapOptions
  ): JQuery = js.native
  def clearAll(): JQuery = js.native
  def clearAll(clearCallbacks: scala.Boolean): JQuery = js.native
  def clearScenegraph(): JQuery = js.native
  def collision(): JQuery = js.native
  def collision(query: js.Any): JQuery = js.native
  def fliph(): JQuery = js.native
  def fliph(flip: scala.Boolean): JQuery = js.native
  def flipv(): JQuery = js.native
  def flipv(flip: scala.Boolean): JQuery = js.native
  def h(): scala.Double = js.native
  def h(value: scala.Double): JQuery = js.native
  def h(value: scala.Double, relative: scala.Boolean): JQuery = js.native
  def loadCallback(callback: js.Function1[/* percent */ scala.Double, scala.Unit]): JQuery = js.native
  def pauseAnimation(): JQuery = js.native
  def pauseGame(): JQuery = js.native
  def playground(): JQuery = js.native
  def playground(options: PlaygroundOptions): JQuery = js.native
  def registerCallback(callback: js.Function0[scala.Boolean | scala.Double | scala.Unit], rate: scala.Double): JQuery = js.native
  def resumeAnimation(): JQuery = js.native
  def resumeGame(): JQuery = js.native
  def resumeGame(callback: js.Function0[scala.Unit]): JQuery = js.native
  def rotate(angle: scala.Double): JQuery = js.native
  def rotate(angle: scala.Double, relative: scala.Boolean): JQuery = js.native
  def scale(ratio: scala.Double): JQuery = js.native
  def scale(ratio: scala.Double, relative: scala.Boolean): JQuery = js.native
  def setAnimation(): JQuery = js.native
  def setAnimation(animation: Animation): JQuery = js.native
  def setAnimation(animation: Animation, callback: js.Function0[_]): JQuery = js.native
  def setAnimation(animation: scala.Double): JQuery = js.native
  def setAnimation(animation: scala.Double, callback: js.Function0[_]): JQuery = js.native
  def startGame(): JQuery = js.native
  def startGame(callback: js.Function0[scala.Unit]): JQuery = js.native
  def w(): scala.Double = js.native
  def w(value: scala.Double): JQuery = js.native
  def w(value: scala.Double, relative: scala.Boolean): JQuery = js.native
  def wh(): Size = js.native
  def wh(width: scala.Double, height: scala.Double): JQuery = js.native
  def wh(width: scala.Double, height: scala.Double, relative: scala.Boolean): JQuery = js.native
  def x(): scala.Double = js.native
  def x(value: scala.Double): JQuery = js.native
  def x(value: scala.Double, relative: scala.Boolean): JQuery = js.native
  def xy(): Coordinate3D = js.native
  def xy(x: scala.Double, y: scala.Double): JQuery = js.native
  def xy(x: scala.Double, y: scala.Double, relative: scala.Boolean): JQuery = js.native
  def xyz(): Coordinate3D = js.native
  def xyz(x: scala.Double, y: scala.Double, z: scala.Double): JQuery = js.native
  def xyz(x: scala.Double, y: scala.Double, z: scala.Double, relative: scala.Boolean): JQuery = js.native
  def y(): scala.Double = js.native
  def y(value: scala.Double): JQuery = js.native
  def y(value: scala.Double, relative: scala.Boolean): JQuery = js.native
  def z(): scala.Double = js.native
  def z(value: scala.Double): JQuery = js.native
  def z(value: scala.Double, relative: scala.Boolean): JQuery = js.native
}

