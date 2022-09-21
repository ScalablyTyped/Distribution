package typings.gamequery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def addGroup(name: String, options: GroupOptions): JQuery = js.native
  
  def addSprite(name: String, options: SpriteOptions): JQuery = js.native
  
  def addTilemap(
    name: String,
    tileDescription: js.Array[js.Array[Double]],
    animationList: js.Array[Animation],
    options: TileMapOptions
  ): JQuery = js.native
  def addTilemap(
    name: String,
    tileDescription: js.Array[js.Array[Double]],
    animation: Animation,
    options: TileMapOptions
  ): JQuery = js.native
  def addTilemap(
    name: String,
    tileDescription: js.Function2[/* i */ Double, /* j */ Double, Double],
    animationList: js.Array[Animation],
    options: TileMapOptions
  ): JQuery = js.native
  def addTilemap(
    name: String,
    tileDescription: js.Function2[/* i */ Double, /* j */ Double, Double],
    animation: Animation,
    options: TileMapOptions
  ): JQuery = js.native
  
  def clearAll(): JQuery = js.native
  def clearAll(clearCallbacks: Boolean): JQuery = js.native
  
  def clearScenegraph(): JQuery = js.native
  
  def collision(): JQuery = js.native
  def collision(query: Any): JQuery = js.native
  
  def fliph(): JQuery = js.native
  def fliph(flip: Boolean): JQuery = js.native
  
  def flipv(): JQuery = js.native
  def flipv(flip: Boolean): JQuery = js.native
  
  var gQ: GameQuery = js.native
  
  def h(): Double = js.native
  def h(value: Double): JQuery = js.native
  def h(value: Double, relative: Boolean): JQuery = js.native
  
  def loadCallback(callback: js.Function1[/* percent */ Double, Unit]): JQuery = js.native
  
  def pauseAnimation(): JQuery = js.native
  
  def pauseGame(): JQuery = js.native
  
  def playground(): JQuery = js.native
  def playground(options: PlaygroundOptions): JQuery = js.native
  
  def registerCallback(callback: js.Function0[Boolean | Double | Unit], rate: Double): JQuery = js.native
  
  def resumeAnimation(): JQuery = js.native
  
  def resumeGame(): JQuery = js.native
  def resumeGame(callback: js.Function0[Unit]): JQuery = js.native
  
  def rotate(angle: Double): JQuery = js.native
  def rotate(angle: Double, relative: Boolean): JQuery = js.native
  
  def scale(ratio: Double): JQuery = js.native
  def scale(ratio: Double, relative: Boolean): JQuery = js.native
  
  def setAnimation(): JQuery = js.native
  def setAnimation(animation: Double): JQuery = js.native
  def setAnimation(animation: Double, callback: js.Function0[Any]): JQuery = js.native
  def setAnimation(animation: Animation): JQuery = js.native
  def setAnimation(animation: Animation, callback: js.Function0[Any]): JQuery = js.native
  
  def startGame(): JQuery = js.native
  def startGame(callback: js.Function0[Unit]): JQuery = js.native
  
  def w(): Double = js.native
  def w(value: Double): JQuery = js.native
  def w(value: Double, relative: Boolean): JQuery = js.native
  
  def wh(): Size = js.native
  def wh(width: Double, height: Double): JQuery = js.native
  def wh(width: Double, height: Double, relative: Boolean): JQuery = js.native
  
  def x(): Double = js.native
  def x(value: Double): JQuery = js.native
  def x(value: Double, relative: Boolean): JQuery = js.native
  
  def xy(): Coordinate3D = js.native
  def xy(x: Double, y: Double): JQuery = js.native
  def xy(x: Double, y: Double, relative: Boolean): JQuery = js.native
  
  def xyz(): Coordinate3D = js.native
  def xyz(x: Double, y: Double, z: Double): JQuery = js.native
  def xyz(x: Double, y: Double, z: Double, relative: Boolean): JQuery = js.native
  
  def y(): Double = js.native
  def y(value: Double): JQuery = js.native
  def y(value: Double, relative: Boolean): JQuery = js.native
  
  def z(): Double = js.native
  def z(value: Double): JQuery = js.native
  def z(value: Double, relative: Boolean): JQuery = js.native
}
