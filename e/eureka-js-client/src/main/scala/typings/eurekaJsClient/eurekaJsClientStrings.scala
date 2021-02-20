package typings.eurekaJsClient

import typings.eurekaJsClient.mod.EurekaClient.ActionType
import typings.eurekaJsClient.mod.EurekaClient.DataCenterName
import typings.eurekaJsClient.mod.EurekaClient.InstanceStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eurekaJsClientStrings {
  
  @js.native
  sealed trait ADDED extends ActionType
  @scala.inline
  def ADDED: ADDED = "ADDED".asInstanceOf[ADDED]
  
  @js.native
  sealed trait Amazon extends DataCenterName
  @scala.inline
  def Amazon: Amazon = "Amazon".asInstanceOf[Amazon]
  
  @js.native
  sealed trait DELETED extends ActionType
  @scala.inline
  def DELETED: DELETED = "DELETED".asInstanceOf[DELETED]
  
  @js.native
  sealed trait DOWN extends InstanceStatus
  @scala.inline
  def DOWN: DOWN = "DOWN".asInstanceOf[DOWN]
  
  @js.native
  sealed trait MODIFIED extends ActionType
  @scala.inline
  def MODIFIED: MODIFIED = "MODIFIED".asInstanceOf[MODIFIED]
  
  @js.native
  sealed trait MyOwn extends DataCenterName
  @scala.inline
  def MyOwn: MyOwn = "MyOwn".asInstanceOf[MyOwn]
  
  @js.native
  sealed trait Netflix extends DataCenterName
  @scala.inline
  def Netflix: Netflix = "Netflix".asInstanceOf[Netflix]
  
  @js.native
  sealed trait OUT_OF_SERVICE extends InstanceStatus
  @scala.inline
  def OUT_OF_SERVICE: OUT_OF_SERVICE = "OUT_OF_SERVICE".asInstanceOf[OUT_OF_SERVICE]
  
  @js.native
  sealed trait STARTING extends InstanceStatus
  @scala.inline
  def STARTING: STARTING = "STARTING".asInstanceOf[STARTING]
  
  @js.native
  sealed trait UNKNOWN extends InstanceStatus
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait UP extends InstanceStatus
  @scala.inline
  def UP: UP = "UP".asInstanceOf[UP]
}
