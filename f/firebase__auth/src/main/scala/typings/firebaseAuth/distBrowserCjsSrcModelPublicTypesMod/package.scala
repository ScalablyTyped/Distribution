package typings.firebaseAuth.distBrowserCjsSrcModelPublicTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseUtil.mod.NextFn
import typings.firebaseUtil.mod.Observer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type NextOrObserver[T] = (NextFn[T | Null]) | (Observer[T | Null])

type PhoneMultiFactorAssertion = MultiFactorAssertion

type RecaptchaParameters = StringDictionary[Any]

type TotpMultiFactorAssertion = MultiFactorAssertion

type TotpMultiFactorInfo = MultiFactorInfo

type UserProfile = Record[String, Any]
