package typings
package getenvLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object getenvLibStrings {
  @js.native
  sealed trait bool
    extends getenvLib.getenvMod.ParseTypes
  
  @js.native
  sealed trait boolish
    extends getenvLib.getenvMod.ParseTypes
  
  @js.native
  sealed trait float
    extends getenvLib.getenvMod.ParseTypes
  
  @js.native
  sealed trait int
    extends getenvLib.getenvMod.ParseTypes
  
  @js.native
  sealed trait multi extends js.Object
  
  @js.native
  sealed trait string
    extends getenvLib.getenvMod.ParseTypes
  
  @js.native
  sealed trait url
    extends getenvLib.getenvMod.ParseTypes
  
  @scala.inline
  def bool: bool = "bool".asInstanceOf[bool]
  @scala.inline
  def boolish: boolish = "boolish".asInstanceOf[boolish]
  @scala.inline
  def float: float = "float".asInstanceOf[float]
  @scala.inline
  def int: int = "int".asInstanceOf[int]
  @scala.inline
  def multi: multi = "multi".asInstanceOf[multi]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def url: url = "url".asInstanceOf[url]
}

