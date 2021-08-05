package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 断言测试模块，如果测试值为假，则报错，报错行为可设定继续运行或者错误抛出
  * @detail 引用方法：,```JavaScript,var assert = require('assert');,```,或者通过 test 模块引用：,```JavaScript,var test = require('test');,var assert = test.assert;,```,或者通过 test.setup 配置：,```JavaScript,require("test").setup();,```
  */
object mod {
  
  @JSImport("assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Function(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Function")().asInstanceOf[Unit]
  inline def Function(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Function")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def Function(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Function")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Function(actual: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Function")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def closeTo(actual: js.Any, expected: js.Any, delta: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("closeTo")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def closeTo(actual: js.Any, expected: js.Any, delta: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("closeTo")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deepEqual(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")().asInstanceOf[Unit]
  inline def deepEqual(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def deepEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deepEqual(actual: js.Any, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deepEqual(actual: js.Any, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deepEqual(actual: Unit, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deepEqual(actual: Unit, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deepEqual(actual: Unit, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deepProperty(`object`: js.Any, prop: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepProperty")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deepProperty(`object`: js.Any, prop: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepProperty")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deepPropertyNotVal(`object`: js.Any, prop: js.Any, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepPropertyNotVal")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deepPropertyNotVal(`object`: js.Any, prop: js.Any, value: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepPropertyNotVal")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deepPropertyVal(`object`: js.Any, prop: js.Any, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepPropertyVal")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deepPropertyVal(`object`: js.Any, prop: js.Any, value: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepPropertyVal")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def doesNotThrow(block: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def doesNotThrow(block: js.Function, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def equal(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("equal")().asInstanceOf[Unit]
  inline def equal(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def equal(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equal(actual: js.Any, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equal(actual: js.Any, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equal(actual: Unit, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equal(actual: Unit, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equal(actual: Unit, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def exist(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exist")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def exist(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exist")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def greaterThan(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def greaterThan(actual: js.Any, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ifError(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ifError")().asInstanceOf[Unit]
  inline def ifError(`object`: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ifError")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isArray(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def isArray(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isBoolean(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def isBoolean(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isDefined(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def isDefined(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isFalse(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isFalse")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def isFalse(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isFalse")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isFunction(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def isFunction(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isNotArray(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotArray")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def isNotArray(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotArray")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isNotBoolean(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotBoolean")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def isNotBoolean(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotBoolean")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isNotFalse(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotFalse")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def isNotFalse(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotFalse")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isNotFunction(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotFunction")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def isNotFunction(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotFunction")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isNotNull(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotNull")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def isNotNull(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotNull")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isNotNumber(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotNumber")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def isNotNumber(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotNumber")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isNotObject(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotObject")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def isNotObject(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotObject")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isNotString(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotString")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def isNotString(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotString")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isNotTrue(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotTrue")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def isNotTrue(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotTrue")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isNull(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def isNull(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isNumber(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def isNumber(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isObject(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def isObject(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isString(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def isString(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isString")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isTrue(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isTrue")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def isTrue(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isTrue")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isUndefined(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def isUndefined(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def lessThan(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lessThan(actual: js.Any, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def notCloseTo(actual: js.Any, expected: js.Any, delta: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notCloseTo")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notCloseTo(actual: js.Any, expected: js.Any, delta: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notCloseTo")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def notDeepEqual(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")().asInstanceOf[Unit]
  inline def notDeepEqual(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def notDeepEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notDeepEqual(actual: js.Any, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notDeepEqual(actual: js.Any, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notDeepEqual(actual: Unit, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notDeepEqual(actual: Unit, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notDeepEqual(actual: Unit, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def notDeepProperty(`object`: js.Any, prop: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepProperty")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notDeepProperty(`object`: js.Any, prop: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepProperty")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def notEqual(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")().asInstanceOf[Unit]
  inline def notEqual(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def notEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notEqual(actual: js.Any, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notEqual(actual: js.Any, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notEqual(actual: Unit, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notEqual(actual: Unit, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notEqual(actual: Unit, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def notExist(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notExist")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def notExist(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notExist")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def notGreaterThan(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notGreaterThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notGreaterThan(actual: js.Any, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notGreaterThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def notLessThan(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notLessThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notLessThan(actual: js.Any, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notLessThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def notOk(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notOk")().asInstanceOf[Unit]
  inline def notOk(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notOk")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def notOk(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notOk")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notOk(actual: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notOk")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def notProperty(`object`: js.Any, prop: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notProperty")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notProperty(`object`: js.Any, prop: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notProperty")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def notStrictEqual(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")().asInstanceOf[Unit]
  inline def notStrictEqual(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def notStrictEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notStrictEqual(actual: js.Any, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notStrictEqual(actual: js.Any, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notStrictEqual(actual: Unit, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notStrictEqual(actual: Unit, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notStrictEqual(actual: Unit, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def notTypeOf(actual: js.Any, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notTypeOf")(actual.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notTypeOf(actual: js.Any, `type`: String, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notTypeOf")(actual.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ok(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ok")().asInstanceOf[Unit]
  inline def ok(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ok")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def ok(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ok")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ok(actual: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ok")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def property(`object`: js.Any, prop: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("property")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def property(`object`: js.Any, prop: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("property")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def propertyNotVal(`object`: js.Any, prop: js.Any, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("propertyNotVal")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def propertyNotVal(`object`: js.Any, prop: js.Any, value: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("propertyNotVal")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def propertyVal(`object`: js.Any, prop: js.Any, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("propertyVal")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def propertyVal(`object`: js.Any, prop: js.Any, value: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("propertyVal")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def strictEqual(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")().asInstanceOf[Unit]
  inline def strictEqual(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def strictEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def strictEqual(actual: js.Any, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def strictEqual(actual: js.Any, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def strictEqual(actual: Unit, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def strictEqual(actual: Unit, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def strictEqual(actual: Unit, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def throws(block: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def throws(block: js.Function, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def typeOf(actual: js.Any, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeOf")(actual.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def typeOf(actual: js.Any, `type`: String, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeOf")(actual.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
