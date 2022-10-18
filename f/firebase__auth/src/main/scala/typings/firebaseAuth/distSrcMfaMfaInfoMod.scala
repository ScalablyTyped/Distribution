package typings.firebaseAuth

import typings.firebaseAuth.distSrcApiAccountManagementMfaMod.MfaEnrollment
import typings.firebaseAuth.distSrcModelAuthMod.AuthInternal
import typings.firebaseAuth.distSrcModelPublicTypesMod.FactorId
import typings.firebaseAuth.distSrcModelPublicTypesMod.MultiFactorInfo
import typings.firebaseAuth.distSrcModelPublicTypesMod.PhoneMultiFactorInfo
import typings.firebaseAuth.firebaseAuthStrings.phone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMfaMfaInfoMod {
  
  /* note: abstract class */ @JSImport("@firebase/auth/dist/src/mfa/mfa_info", "MultiFactorInfoImpl")
  @js.native
  open class MultiFactorInfoImpl protected ()
    extends StObject
       with MultiFactorInfo {
    /* protected */ def this(factorId: FactorId, response: MfaEnrollment) = this()
    
    /** The enrollment date of the second factor formatted as a UTC string. */
    /* CompleteClass */
    override val enrollmentTime: String = js.native
    
    /** The identifier of the second factor. */
    /* CompleteClass */
    override val factorId: phone = js.native
    @JSName("factorId")
    val factorId_MultiFactorInfoImpl: FactorId = js.native
    
    /** The multi-factor enrollment ID. */
    /* CompleteClass */
    override val uid: String = js.native
  }
  /* static members */
  object MultiFactorInfoImpl {
    
    @JSImport("@firebase/auth/dist/src/mfa/mfa_info", "MultiFactorInfoImpl")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _fromServerResponse(auth: AuthInternal, enrollment: MfaEnrollment): MultiFactorInfoImpl = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromServerResponse")(auth.asInstanceOf[js.Any], enrollment.asInstanceOf[js.Any])).asInstanceOf[MultiFactorInfoImpl]
  }
  
  @JSImport("@firebase/auth/dist/src/mfa/mfa_info", "PhoneMultiFactorInfoImpl")
  @js.native
  /* private */ open class PhoneMultiFactorInfoImpl ()
    extends MultiFactorInfoImpl
       with PhoneMultiFactorInfo {
    
    /** The enrollment date of the second factor formatted as a UTC string. */
    /* CompleteClass */
    override val enrollmentTime: String = js.native
    
    /** The identifier of the second factor. */
    /* CompleteClass */
    override val factorId: phone = js.native
    
    /** The phone number associated with the current second factor. */
    /* CompleteClass */
    override val phoneNumber: String = js.native
    
    /** The multi-factor enrollment ID. */
    /* CompleteClass */
    override val uid: String = js.native
  }
  /* static members */
  object PhoneMultiFactorInfoImpl {
    
    @JSImport("@firebase/auth/dist/src/mfa/mfa_info", "PhoneMultiFactorInfoImpl")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _fromServerResponse(_auth: AuthInternal, enrollment: MfaEnrollment): PhoneMultiFactorInfoImpl = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromServerResponse")(_auth.asInstanceOf[js.Any], enrollment.asInstanceOf[js.Any])).asInstanceOf[PhoneMultiFactorInfoImpl]
  }
}
