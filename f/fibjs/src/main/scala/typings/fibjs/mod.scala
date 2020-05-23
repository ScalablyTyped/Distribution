package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
  * @brief 断言测试模块，如果测试值为假，则报错，报错行为可设定继续运行或者错误抛出
  * @detail 引用方法：,```JavaScript,var assert = require('assert');,```,或者通过 test 模块引用：,```JavaScript,var test = require('test');,var assert = test.assert;,```,或者通过 test.setup 配置：,```JavaScript,require("test").setup();,```
  */
@JSImport("assert", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def Function(): Unit = js.native
  def Function(actual: js.Any): Unit = js.native
  def Function(actual: js.Any, msg: String): Unit = js.native
  def closeTo(actual: js.Any, expected: js.Any, delta: js.Any): Unit = js.native
  def closeTo(actual: js.Any, expected: js.Any, delta: js.Any, msg: String): Unit = js.native
  def deepEqual(): Unit = js.native
  def deepEqual(actual: js.Any): Unit = js.native
  def deepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def deepEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
  def deepProperty(`object`: js.Any, prop: js.Any): Unit = js.native
  def deepProperty(`object`: js.Any, prop: js.Any, msg: String): Unit = js.native
  def deepPropertyNotVal(`object`: js.Any, prop: js.Any, value: js.Any): Unit = js.native
  def deepPropertyNotVal(`object`: js.Any, prop: js.Any, value: js.Any, msg: String): Unit = js.native
  def deepPropertyVal(`object`: js.Any, prop: js.Any, value: js.Any): Unit = js.native
  def deepPropertyVal(`object`: js.Any, prop: js.Any, value: js.Any, msg: String): Unit = js.native
  def doesNotThrow(block: js.Function): Unit = js.native
  def doesNotThrow(block: js.Function, msg: String): Unit = js.native
  def equal(): Unit = js.native
  def equal(actual: js.Any): Unit = js.native
  def equal(actual: js.Any, expected: js.Any): Unit = js.native
  def equal(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
  def exist(actual: js.Any): Unit = js.native
  def exist(actual: js.Any, msg: String): Unit = js.native
  def greaterThan(actual: js.Any, expected: js.Any): Unit = js.native
  def greaterThan(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
  def ifError(): Unit = js.native
  def ifError(`object`: js.Any): Unit = js.native
  def isArray(actual: js.Any): Unit = js.native
  def isArray(actual: js.Any, msg: String): Unit = js.native
  def isBoolean(actual: js.Any): Unit = js.native
  def isBoolean(actual: js.Any, msg: String): Unit = js.native
  def isDefined(actual: js.Any): Unit = js.native
  def isDefined(actual: js.Any, msg: String): Unit = js.native
  def isFalse(actual: js.Any): Unit = js.native
  def isFalse(actual: js.Any, msg: String): Unit = js.native
  def isFunction(actual: js.Any): Unit = js.native
  def isFunction(actual: js.Any, msg: String): Unit = js.native
  def isNotArray(actual: js.Any): Unit = js.native
  def isNotArray(actual: js.Any, msg: String): Unit = js.native
  def isNotBoolean(actual: js.Any): Unit = js.native
  def isNotBoolean(actual: js.Any, msg: String): Unit = js.native
  def isNotFalse(actual: js.Any): Unit = js.native
  def isNotFalse(actual: js.Any, msg: String): Unit = js.native
  def isNotFunction(actual: js.Any): Unit = js.native
  def isNotFunction(actual: js.Any, msg: String): Unit = js.native
  def isNotNull(actual: js.Any): Unit = js.native
  def isNotNull(actual: js.Any, msg: String): Unit = js.native
  def isNotNumber(actual: js.Any): Unit = js.native
  def isNotNumber(actual: js.Any, msg: String): Unit = js.native
  def isNotObject(actual: js.Any): Unit = js.native
  def isNotObject(actual: js.Any, msg: String): Unit = js.native
  def isNotString(actual: js.Any): Unit = js.native
  def isNotString(actual: js.Any, msg: String): Unit = js.native
  def isNotTrue(actual: js.Any): Unit = js.native
  def isNotTrue(actual: js.Any, msg: String): Unit = js.native
  def isNull(actual: js.Any): Unit = js.native
  def isNull(actual: js.Any, msg: String): Unit = js.native
  def isNumber(actual: js.Any): Unit = js.native
  def isNumber(actual: js.Any, msg: String): Unit = js.native
  def isObject(actual: js.Any): Unit = js.native
  def isObject(actual: js.Any, msg: String): Unit = js.native
  def isString(actual: js.Any): Unit = js.native
  def isString(actual: js.Any, msg: String): Unit = js.native
  def isTrue(actual: js.Any): Unit = js.native
  def isTrue(actual: js.Any, msg: String): Unit = js.native
  def isUndefined(actual: js.Any): Unit = js.native
  def isUndefined(actual: js.Any, msg: String): Unit = js.native
  def lessThan(actual: js.Any, expected: js.Any): Unit = js.native
  def lessThan(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
  def notCloseTo(actual: js.Any, expected: js.Any, delta: js.Any): Unit = js.native
  def notCloseTo(actual: js.Any, expected: js.Any, delta: js.Any, msg: String): Unit = js.native
  def notDeepEqual(): Unit = js.native
  def notDeepEqual(actual: js.Any): Unit = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
  def notDeepProperty(`object`: js.Any, prop: js.Any): Unit = js.native
  def notDeepProperty(`object`: js.Any, prop: js.Any, msg: String): Unit = js.native
  def notEqual(): Unit = js.native
  def notEqual(actual: js.Any): Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
  def notExist(actual: js.Any): Unit = js.native
  def notExist(actual: js.Any, msg: String): Unit = js.native
  def notGreaterThan(actual: js.Any, expected: js.Any): Unit = js.native
  def notGreaterThan(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
  def notLessThan(actual: js.Any, expected: js.Any): Unit = js.native
  def notLessThan(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
  def notOk(): Unit = js.native
  def notOk(actual: js.Any): Unit = js.native
  def notOk(actual: js.Any, msg: String): Unit = js.native
  def notProperty(`object`: js.Any, prop: js.Any): Unit = js.native
  def notProperty(`object`: js.Any, prop: js.Any, msg: String): Unit = js.native
  def notStrictEqual(): Unit = js.native
  def notStrictEqual(actual: js.Any): Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
  def notTypeOf(actual: js.Any, `type`: String): Unit = js.native
  def notTypeOf(actual: js.Any, `type`: String, msg: String): Unit = js.native
  def ok(): Unit = js.native
  def ok(actual: js.Any): Unit = js.native
  def ok(actual: js.Any, msg: String): Unit = js.native
  def property(`object`: js.Any, prop: js.Any): Unit = js.native
  def property(`object`: js.Any, prop: js.Any, msg: String): Unit = js.native
  def propertyNotVal(`object`: js.Any, prop: js.Any, value: js.Any): Unit = js.native
  def propertyNotVal(`object`: js.Any, prop: js.Any, value: js.Any, msg: String): Unit = js.native
  def propertyVal(`object`: js.Any, prop: js.Any, value: js.Any): Unit = js.native
  def propertyVal(`object`: js.Any, prop: js.Any, value: js.Any, msg: String): Unit = js.native
  def strictEqual(): Unit = js.native
  def strictEqual(actual: js.Any): Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
  def throws(block: js.Function): Unit = js.native
  def throws(block: js.Function, msg: String): Unit = js.native
  def typeOf(actual: js.Any, `type`: String): Unit = js.native
  def typeOf(actual: js.Any, `type`: String, msg: String): Unit = js.native
}

