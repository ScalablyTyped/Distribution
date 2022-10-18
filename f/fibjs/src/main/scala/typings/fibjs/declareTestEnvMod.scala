package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declareTestEnvMod {
  
  object global {
    
    /* was `typeof test.after` */
    inline def after(func: js.Function): Unit = js.Dynamic.global.applyDynamic("after")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* was `typeof test.afterEach` */
    inline def afterEach(func: js.Function): Unit = js.Dynamic.global.applyDynamic("afterEach")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* was `typeof _assert` */
    object assert {
      
      @JSGlobal("assert")
      @js.native
      val ^ : js.Any = js.native
      
      inline def Function(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Function")().asInstanceOf[Unit]
      inline def Function(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Function")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def Function(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Function")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def Function(actual: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Function")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def closeTo(actual: Any, expected: Any, delta: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("closeTo")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def closeTo(actual: Any, expected: Any, delta: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("closeTo")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def deepEqual(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")().asInstanceOf[Unit]
      inline def deepEqual(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def deepEqual(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def deepEqual(actual: Any, expected: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def deepEqual(actual: Any, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def deepEqual(actual: Unit, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def deepEqual(actual: Unit, expected: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def deepEqual(actual: Unit, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def deepProperty(`object`: Any, prop: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepProperty")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def deepProperty(`object`: Any, prop: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepProperty")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def deepPropertyNotVal(`object`: Any, prop: Any, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepPropertyNotVal")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def deepPropertyNotVal(`object`: Any, prop: Any, value: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepPropertyNotVal")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def deepPropertyVal(`object`: Any, prop: Any, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepPropertyVal")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def deepPropertyVal(`object`: Any, prop: Any, value: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepPropertyVal")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def doesNotThrow(block: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def doesNotThrow(block: js.Function, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def equal(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("equal")().asInstanceOf[Unit]
      inline def equal(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def equal(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def equal(actual: Any, expected: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def equal(actual: Any, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def equal(actual: Unit, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def equal(actual: Unit, expected: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def equal(actual: Unit, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def exist(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exist")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def exist(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exist")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def greaterThan(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def greaterThan(actual: Any, expected: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def ifError(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ifError")().asInstanceOf[Unit]
      inline def ifError(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ifError")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def isArray(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def isArray(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def isBoolean(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def isBoolean(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def isDefined(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def isDefined(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def isFalse(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isFalse")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def isFalse(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isFalse")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def isFunction(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def isFunction(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def isNotArray(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotArray")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def isNotArray(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotArray")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def isNotBoolean(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotBoolean")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def isNotBoolean(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotBoolean")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def isNotFalse(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotFalse")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def isNotFalse(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotFalse")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def isNotFunction(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotFunction")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def isNotFunction(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotFunction")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def isNotNull(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotNull")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def isNotNull(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotNull")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def isNotNumber(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotNumber")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def isNotNumber(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotNumber")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def isNotObject(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotObject")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def isNotObject(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotObject")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def isNotString(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotString")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def isNotString(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotString")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def isNotTrue(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotTrue")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def isNotTrue(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotTrue")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def isNull(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def isNull(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def isNumber(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def isNumber(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def isObject(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def isObject(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def isString(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def isString(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isString")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def isTrue(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isTrue")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def isTrue(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isTrue")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def isUndefined(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def isUndefined(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def lessThan(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def lessThan(actual: Any, expected: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def notCloseTo(actual: Any, expected: Any, delta: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notCloseTo")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def notCloseTo(actual: Any, expected: Any, delta: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notCloseTo")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def notDeepEqual(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")().asInstanceOf[Unit]
      inline def notDeepEqual(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def notDeepEqual(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def notDeepEqual(actual: Any, expected: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def notDeepEqual(actual: Any, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def notDeepEqual(actual: Unit, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def notDeepEqual(actual: Unit, expected: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def notDeepEqual(actual: Unit, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def notDeepProperty(`object`: Any, prop: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepProperty")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def notDeepProperty(`object`: Any, prop: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepProperty")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def notEqual(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")().asInstanceOf[Unit]
      inline def notEqual(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def notEqual(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def notEqual(actual: Any, expected: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def notEqual(actual: Any, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def notEqual(actual: Unit, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def notEqual(actual: Unit, expected: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def notEqual(actual: Unit, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def notExist(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notExist")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def notExist(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notExist")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def notGreaterThan(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notGreaterThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def notGreaterThan(actual: Any, expected: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notGreaterThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def notLessThan(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notLessThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def notLessThan(actual: Any, expected: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notLessThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def notOk(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notOk")().asInstanceOf[Unit]
      inline def notOk(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notOk")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def notOk(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notOk")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def notOk(actual: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notOk")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def notProperty(`object`: Any, prop: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notProperty")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def notProperty(`object`: Any, prop: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notProperty")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def notStrictEqual(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")().asInstanceOf[Unit]
      inline def notStrictEqual(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def notStrictEqual(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def notStrictEqual(actual: Any, expected: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def notStrictEqual(actual: Any, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def notStrictEqual(actual: Unit, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def notStrictEqual(actual: Unit, expected: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def notStrictEqual(actual: Unit, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def notTypeOf(actual: Any, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notTypeOf")(actual.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def notTypeOf(actual: Any, `type`: String, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notTypeOf")(actual.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def ok(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ok")().asInstanceOf[Unit]
      inline def ok(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ok")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def ok(actual: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ok")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def ok(actual: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ok")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def property(`object`: Any, prop: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("property")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def property(`object`: Any, prop: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("property")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def propertyNotVal(`object`: Any, prop: Any, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("propertyNotVal")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def propertyNotVal(`object`: Any, prop: Any, value: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("propertyNotVal")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def propertyVal(`object`: Any, prop: Any, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("propertyVal")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def propertyVal(`object`: Any, prop: Any, value: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("propertyVal")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def strictEqual(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")().asInstanceOf[Unit]
      inline def strictEqual(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def strictEqual(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def strictEqual(actual: Any, expected: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def strictEqual(actual: Any, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def strictEqual(actual: Unit, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def strictEqual(actual: Unit, expected: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def strictEqual(actual: Unit, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def throws(block: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def throws(block: js.Function, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def typeOf(actual: Any, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeOf")(actual.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def typeOf(actual: Any, `type`: String, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeOf")(actual.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    /* was `typeof test.before` */
    inline def before(func: js.Function): Unit = js.Dynamic.global.applyDynamic("before")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* was `typeof test.beforeEach` */
    inline def beforeEach(func: js.Function): Unit = js.Dynamic.global.applyDynamic("beforeEach")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* was `typeof test.describe` */
    inline def describe(name: String, block: js.Function): Unit = (js.Dynamic.global.applyDynamic("describe")(name.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* was `typeof test.it` */
    inline def it(name: String, block: js.Function): Unit = (js.Dynamic.global.applyDynamic("it")(name.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* was `typeof test.odescribe` */
    inline def odescribe(name: String, block: js.Function): Unit = (js.Dynamic.global.applyDynamic("odescribe")(name.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* was `typeof test.oit` */
    inline def oit(name: String, block: js.Function): Unit = (js.Dynamic.global.applyDynamic("oit")(name.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* was `typeof test.run` */
    inline def run(): Double = js.Dynamic.global.applyDynamic("run")().asInstanceOf[Double]
    inline def run(loglevel: Double): Double = js.Dynamic.global.applyDynamic("run")(loglevel.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /* was `typeof test.setup` */
    inline def setup(): Unit = js.Dynamic.global.applyDynamic("setup")().asInstanceOf[Unit]
    
    /* was `typeof test.xdescribe` */
    inline def xdescribe(name: String, block: js.Function): Unit = (js.Dynamic.global.applyDynamic("xdescribe")(name.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* was `typeof test.xit` */
    inline def xit(name: String, block: js.Function): Unit = (js.Dynamic.global.applyDynamic("xit")(name.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
