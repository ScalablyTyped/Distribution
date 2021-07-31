package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testEnvMod {
  
  object global {
    
    /* was `typeof test.after` */
    @scala.inline
    def after(func: js.Function): Unit = js.Dynamic.global.applyDynamic("after")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* was `typeof test.afterEach` */
    @scala.inline
    def afterEach(func: js.Function): Unit = js.Dynamic.global.applyDynamic("afterEach")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* was `typeof _assert` */
    object assert {
      
      @JSGlobal("assert")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def Function(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Function")().asInstanceOf[Unit]
      @scala.inline
      def Function(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Function")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def Function(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Function")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def Function(actual: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Function")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def closeTo(actual: js.Any, expected: js.Any, delta: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("closeTo")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def closeTo(actual: js.Any, expected: js.Any, delta: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("closeTo")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def deepEqual(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")().asInstanceOf[Unit]
      @scala.inline
      def deepEqual(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def deepEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def deepEqual(actual: js.Any, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def deepEqual(actual: js.Any, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def deepEqual(actual: Unit, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def deepEqual(actual: Unit, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def deepEqual(actual: Unit, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def deepProperty(`object`: js.Any, prop: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepProperty")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def deepProperty(`object`: js.Any, prop: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepProperty")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def deepPropertyNotVal(`object`: js.Any, prop: js.Any, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepPropertyNotVal")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def deepPropertyNotVal(`object`: js.Any, prop: js.Any, value: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepPropertyNotVal")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def deepPropertyVal(`object`: js.Any, prop: js.Any, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepPropertyVal")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def deepPropertyVal(`object`: js.Any, prop: js.Any, value: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepPropertyVal")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def doesNotThrow(block: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def doesNotThrow(block: js.Function, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def equal(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("equal")().asInstanceOf[Unit]
      @scala.inline
      def equal(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def equal(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def equal(actual: js.Any, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def equal(actual: js.Any, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def equal(actual: Unit, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def equal(actual: Unit, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def equal(actual: Unit, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def exist(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exist")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def exist(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exist")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def greaterThan(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def greaterThan(actual: js.Any, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def ifError(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ifError")().asInstanceOf[Unit]
      @scala.inline
      def ifError(`object`: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ifError")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @scala.inline
      def isArray(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def isArray(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def isBoolean(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def isBoolean(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def isDefined(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def isDefined(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def isFalse(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isFalse")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def isFalse(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isFalse")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def isFunction(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def isFunction(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def isNotArray(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotArray")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def isNotArray(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotArray")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def isNotBoolean(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotBoolean")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def isNotBoolean(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotBoolean")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def isNotFalse(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotFalse")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def isNotFalse(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotFalse")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def isNotFunction(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotFunction")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def isNotFunction(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotFunction")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def isNotNull(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotNull")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def isNotNull(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotNull")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def isNotNumber(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotNumber")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def isNotNumber(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotNumber")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def isNotObject(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotObject")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def isNotObject(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotObject")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def isNotString(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotString")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def isNotString(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotString")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def isNotTrue(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotTrue")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def isNotTrue(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotTrue")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def isNull(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def isNull(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def isNumber(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def isNumber(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def isObject(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def isObject(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def isString(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def isString(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isString")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def isTrue(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isTrue")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def isTrue(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isTrue")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def isUndefined(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def isUndefined(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def lessThan(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def lessThan(actual: js.Any, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def notCloseTo(actual: js.Any, expected: js.Any, delta: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notCloseTo")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def notCloseTo(actual: js.Any, expected: js.Any, delta: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notCloseTo")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def notDeepEqual(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")().asInstanceOf[Unit]
      @scala.inline
      def notDeepEqual(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def notDeepEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def notDeepEqual(actual: js.Any, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def notDeepEqual(actual: js.Any, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def notDeepEqual(actual: Unit, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def notDeepEqual(actual: Unit, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def notDeepEqual(actual: Unit, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def notDeepProperty(`object`: js.Any, prop: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepProperty")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def notDeepProperty(`object`: js.Any, prop: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepProperty")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def notEqual(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")().asInstanceOf[Unit]
      @scala.inline
      def notEqual(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def notEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def notEqual(actual: js.Any, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def notEqual(actual: js.Any, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def notEqual(actual: Unit, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def notEqual(actual: Unit, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def notEqual(actual: Unit, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def notExist(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notExist")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def notExist(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notExist")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def notGreaterThan(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notGreaterThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def notGreaterThan(actual: js.Any, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notGreaterThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def notLessThan(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notLessThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def notLessThan(actual: js.Any, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notLessThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def notOk(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notOk")().asInstanceOf[Unit]
      @scala.inline
      def notOk(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notOk")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def notOk(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notOk")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def notOk(actual: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notOk")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def notProperty(`object`: js.Any, prop: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notProperty")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def notProperty(`object`: js.Any, prop: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notProperty")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def notStrictEqual(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")().asInstanceOf[Unit]
      @scala.inline
      def notStrictEqual(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def notStrictEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def notStrictEqual(actual: js.Any, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def notStrictEqual(actual: js.Any, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def notStrictEqual(actual: Unit, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def notStrictEqual(actual: Unit, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def notStrictEqual(actual: Unit, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def notTypeOf(actual: js.Any, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notTypeOf")(actual.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def notTypeOf(actual: js.Any, `type`: String, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notTypeOf")(actual.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def ok(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ok")().asInstanceOf[Unit]
      @scala.inline
      def ok(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ok")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def ok(actual: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ok")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def ok(actual: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ok")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def property(`object`: js.Any, prop: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("property")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def property(`object`: js.Any, prop: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("property")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def propertyNotVal(`object`: js.Any, prop: js.Any, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("propertyNotVal")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def propertyNotVal(`object`: js.Any, prop: js.Any, value: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("propertyNotVal")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def propertyVal(`object`: js.Any, prop: js.Any, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("propertyVal")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def propertyVal(`object`: js.Any, prop: js.Any, value: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("propertyVal")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def strictEqual(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")().asInstanceOf[Unit]
      @scala.inline
      def strictEqual(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def strictEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def strictEqual(actual: js.Any, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def strictEqual(actual: js.Any, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def strictEqual(actual: Unit, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def strictEqual(actual: Unit, expected: js.Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def strictEqual(actual: Unit, expected: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def throws(block: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
      @scala.inline
      def throws(block: js.Function, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def typeOf(actual: js.Any, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeOf")(actual.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def typeOf(actual: js.Any, `type`: String, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeOf")(actual.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    /* was `typeof test.before` */
    @scala.inline
    def before(func: js.Function): Unit = js.Dynamic.global.applyDynamic("before")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* was `typeof test.beforeEach` */
    @scala.inline
    def beforeEach(func: js.Function): Unit = js.Dynamic.global.applyDynamic("beforeEach")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* was `typeof test.describe` */
    @scala.inline
    def describe(name: String, block: js.Function): Unit = (js.Dynamic.global.applyDynamic("describe")(name.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* was `typeof test.it` */
    @scala.inline
    def it(name: String, block: js.Function): Unit = (js.Dynamic.global.applyDynamic("it")(name.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* was `typeof test.odescribe` */
    @scala.inline
    def odescribe(name: String, block: js.Function): Unit = (js.Dynamic.global.applyDynamic("odescribe")(name.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* was `typeof test.oit` */
    @scala.inline
    def oit(name: String, block: js.Function): Unit = (js.Dynamic.global.applyDynamic("oit")(name.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* was `typeof test.run` */
    @scala.inline
    def run(): Double = js.Dynamic.global.applyDynamic("run")().asInstanceOf[Double]
    @scala.inline
    def run(loglevel: Double): Double = js.Dynamic.global.applyDynamic("run")(loglevel.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /* was `typeof test.setup` */
    @scala.inline
    def setup(): Unit = js.Dynamic.global.applyDynamic("setup")().asInstanceOf[Unit]
    
    /* was `typeof test.xdescribe` */
    @scala.inline
    def xdescribe(name: String, block: js.Function): Unit = (js.Dynamic.global.applyDynamic("xdescribe")(name.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* was `typeof test.xit` */
    @scala.inline
    def xit(name: String, block: js.Function): Unit = (js.Dynamic.global.applyDynamic("xit")(name.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
