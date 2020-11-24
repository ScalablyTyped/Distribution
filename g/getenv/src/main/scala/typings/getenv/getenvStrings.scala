package typings.getenv

import typings.getenv.mod.ParseTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getenvStrings {
  
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
  
  @js.native
  sealed trait bool extends ParseTypes
  
  @js.native
  sealed trait boolish extends ParseTypes
  
  @js.native
  sealed trait float extends ParseTypes
  
  @js.native
  sealed trait int extends ParseTypes
  
  @js.native
  sealed trait multi extends js.Object
  
  @js.native
  sealed trait string extends ParseTypes
  
  @js.native
  sealed trait url extends ParseTypes
}
