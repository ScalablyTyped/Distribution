package typings.firebaseAuth.publicTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAuth.firebaseAuthStrings.phone
import typings.firebaseUtil.mod.NextFn
import typings.firebaseUtil.mod.Observer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type FactorId = phone

type NextOrObserver[T] = (NextFn[T | Null]) | (Observer[T | Null])

type PhoneMultiFactorAssertion = MultiFactorAssertion

type RecaptchaParameters = StringDictionary[Any]

type UserProfile = Record[String, Any]
