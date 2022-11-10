package typings.facebookJsSdk.facebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CollectionAdsDialogResponse = InstantExperiencesAdsDialogResponse

type EducationExperience = Any

type Experience = Any

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  TEvent extends 'xfbl.render' ? (): void : (response : facebook-js-sdk.facebook.StatusResponse): void
  }}}
  */
type FacebookEventCallback[TEvent /* <: FacebookEventType */] = js.Function0[Unit]

type Page = Any

type PaymentPricepoints = Any

type User = Any

type VideoUploadLimits = Any
