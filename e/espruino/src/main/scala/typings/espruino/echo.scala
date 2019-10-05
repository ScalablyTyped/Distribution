package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("echo")
@js.native
object echo extends js.Object {
  /**
  * <p>Should TinyJS echo what you type back to you? true = yes (Default), false = no. When echo is off, the result of executing a command is not returned. Instead, you must use &#39;print&#39; to send output.</p>
  * 
  * @param echoOn 
  * @url http://www.espruino.com/Reference#l__global_echo
  */
  def apply(echoOn: Boolean): Unit = js.native
}

