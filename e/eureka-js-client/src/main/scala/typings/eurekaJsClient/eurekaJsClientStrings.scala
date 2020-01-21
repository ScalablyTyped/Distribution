package typings.eurekaJsClient

import typings.eurekaJsClient.mod.EurekaClient.ActionType
import typings.eurekaJsClient.mod.EurekaClient.DataCenterName
import typings.eurekaJsClient.mod.EurekaClient.InstanceStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object eurekaJsClientStrings {
  @js.native
  sealed trait ADDED extends ActionType
  
  @js.native
  sealed trait Amazon extends DataCenterName
  
  @js.native
  sealed trait DELETED extends ActionType
  
  @js.native
  sealed trait DOWN extends InstanceStatus
  
  @js.native
  sealed trait MODIFIED extends ActionType
  
  @js.native
  sealed trait MyOwn extends DataCenterName
  
  @js.native
  sealed trait Netflix extends DataCenterName
  
  @js.native
  sealed trait OUT_OF_SERVICE extends InstanceStatus
  
  @js.native
  sealed trait STARTING extends InstanceStatus
  
  @js.native
  sealed trait UNKNOWN extends InstanceStatus
  
  @js.native
  sealed trait UP extends InstanceStatus
  
  @scala.inline
  def ADDED: ADDED = "ADDED".asInstanceOf[ADDED]
  @scala.inline
  def Amazon: Amazon = "Amazon".asInstanceOf[Amazon]
  @scala.inline
  def DELETED: DELETED = "DELETED".asInstanceOf[DELETED]
  @scala.inline
  def DOWN: DOWN = "DOWN".asInstanceOf[DOWN]
  @scala.inline
  def MODIFIED: MODIFIED = "MODIFIED".asInstanceOf[MODIFIED]
  @scala.inline
  def MyOwn: MyOwn = "MyOwn".asInstanceOf[MyOwn]
  @scala.inline
  def Netflix: Netflix = "Netflix".asInstanceOf[Netflix]
  @scala.inline
  def OUT_OF_SERVICE: OUT_OF_SERVICE = "OUT_OF_SERVICE".asInstanceOf[OUT_OF_SERVICE]
  @scala.inline
  def STARTING: STARTING = "STARTING".asInstanceOf[STARTING]
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  @scala.inline
  def UP: UP = "UP".asInstanceOf[UP]
}

