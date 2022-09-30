package typings.firebaseAuth

import typings.firebaseAuth.anon.OmitIArgumentscallee
import typings.firebaseAuth.firebaseAuthStrings.appName
import typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
import typings.firebaseAuth.rnSrcModelPublicTypesMod.Auth
import typings.firebaseUtil.mod.FirebaseError
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rnSrcCoreUtilAssertMod {
  
  @JSImport("@firebase/auth/dist/rn/src/core/util/assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assert[K /* <: AuthErrorCode */](
    assertion: Any,
    auth: Auth,
    code: K,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param data because its type {} extends LessAppName<K> ? [LessAppName<K> | undefined] : [LessAppName<K>] is not an array type */ data: js.Array[js.UndefOr[LessAppName[K]]]
  ): /* asserts assertion */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_assert")(assertion.asInstanceOf[js.Any], auth.asInstanceOf[js.Any], code.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[/* asserts assertion */ Boolean]
  inline def assert[K /* <: AuthErrorCode */](
    assertion: Any,
    code: K,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param data because its type {} extends AuthErrorParams[K] ? [AuthErrorParams[K] | undefined] : [AuthErrorParams[K]] is not an array type */ data: js.Array[
      js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @firebase/auth.@firebase/auth/dist/rn/src/core/errors.AuthErrorParams[K] */ js.Any
      ]
    ]
  ): /* asserts assertion */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_assert")(assertion.asInstanceOf[js.Any], code.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[/* asserts assertion */ Boolean]
  
  inline def assertInstanceOf(auth: Auth, `object`: js.Object, instance: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_assertInstanceOf")(auth.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def assertTypes(args: OmitIArgumentscallee, expected: (TypeExpectation | Optional)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTypes")(scala.List(args.asInstanceOf[js.Any]).`++`(expected.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def createError[K /* <: AuthErrorCode */](
    auth: Auth,
    code: K,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param data because its type {} extends LessAppName<K> ? [LessAppName<K> | undefined] : [LessAppName<K>] is not an array type */ data: js.Array[js.UndefOr[LessAppName[K]]]
  ): FirebaseError = (^.asInstanceOf[js.Dynamic].applyDynamic("_createError")(auth.asInstanceOf[js.Any], code.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[FirebaseError]
  inline def createError[K /* <: AuthErrorCode */](
    code: K,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param data because its type {} extends AuthErrorParams[K] ? [AuthErrorParams[K] | undefined] : [AuthErrorParams[K]] is not an array type */ data: js.Array[
      js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @firebase/auth.@firebase/auth/dist/rn/src/core/errors.AuthErrorParams[K] */ js.Any
      ]
    ]
  ): FirebaseError = (^.asInstanceOf[js.Dynamic].applyDynamic("_createError")(code.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[FirebaseError]
  
  inline def debugAssert(assertion: Any, message: String): /* asserts assertion */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("debugAssert")(assertion.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts assertion */ Boolean]
  
  inline def debugFail(failure: String): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("debugFail")(failure.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  inline def errorWithCustomMessage(auth: Auth, code: AuthErrorCode, message: String): FirebaseError = (^.asInstanceOf[js.Dynamic].applyDynamic("_errorWithCustomMessage")(auth.asInstanceOf[js.Any], code.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[FirebaseError]
  
  inline def fail[K /* <: AuthErrorCode */](
    auth: Auth,
    code: K,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param data because its type {} extends LessAppName<K> ? [LessAppName<K> | undefined] : [LessAppName<K>] is not an array type */ data: js.Array[js.UndefOr[LessAppName[K]]]
  ): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("_fail")(auth.asInstanceOf[js.Any], code.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  inline def fail[K /* <: AuthErrorCode */](
    code: K,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param data because its type {} extends AuthErrorParams[K] ? [AuthErrorParams[K] | undefined] : [AuthErrorParams[K]] is not an array type */ data: js.Array[
      js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @firebase/auth.@firebase/auth/dist/rn/src/core/errors.AuthErrorParams[K] */ js.Any
      ]
    ]
  ): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("_fail")(code.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  
  inline def opt(`type`: TypeExpectation): Optional = ^.asInstanceOf[js.Dynamic].applyDynamic("opt")(`type`.asInstanceOf[js.Any]).asInstanceOf[Optional]
  
  type LessAppName[K /* <: AuthErrorCode */] = Omit[
    /* import warning: importer.ImportType#apply Failed type conversion: @firebase/auth.@firebase/auth/dist/rn/src/core/errors.AuthErrorParams[K] */ js.Any, 
    appName
  ]
  
  type MapType = Record[String, TypeExpectation | Optional]
  
  trait Optional extends StObject {
    
    val `type`: TypeExpectation
  }
  object Optional {
    
    inline def apply(`type`: TypeExpectation): Optional = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optional]
    }
    
    extension [Self <: Optional](x: Self) {
      
      inline def setType(value: TypeExpectation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type TypeExpectation = js.Function | String | Any
}
