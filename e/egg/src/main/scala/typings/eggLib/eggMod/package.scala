package typings
package eggLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eggMod {
  type EggContextHttpClient = urllibLib.urllibMod.HttpClient2
  type EggEnvType = _EggEnvType | java.lang.String
  type EggHttpClient = urllibLib.urllibMod.HttpClient2
  type EggPluginItem = IEggPluginItem | scala.Boolean
  type IApplicationLocals = PlainObject[js.Any]
  type IContextLocals = PlainObject[js.Any]
  type IController = PlainObject[js.Any]
  type IMiddleware = PlainObject[js.Any]
  type IService = PlainObject[js.Any]
  type IgnoreItem = java.lang.String | stdLib.RegExp | (js.Function1[/* ctx */ eggDashViewLib.eggMod.Context, scala.Boolean])
  type IgnoreOrMatch = IgnoreItem | js.Array[IgnoreItem]
  type LoggerLevel = eggDashLoggerLib.eggDashLoggerMod.LoggerLevel
  type PowerPartial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ U in keyof T ]:? T[U]}
    */ eggLib.eggLibStrings.PowerPartial with T
  // Remove specific property from the specific class
  type RemoveSpecProp[T, P] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, P]]
  type RequestArrayBody = js.Array[js.Any]
  type RequestObjectBody = PlainObject[js.Any]
  type RouterPath = java.lang.String | stdLib.RegExp
}
