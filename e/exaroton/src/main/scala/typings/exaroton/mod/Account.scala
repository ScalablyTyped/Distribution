package typings.exaroton.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  /* private */ val client: Client
  
  /**
    * The amount of credits currently available
    */
  val credits: Double
  
  /**
    * Email address
    */
  val email: String
  
  /**
    * Get/update the account info
    *
    * @throws {RequestError}
    */
  def get(): js.Promise[Account]
  
  /**
    * Username
    */
  val name: String
  
  /**
    * Map raw objects to this instance
    *
    * @param account
    */
  def setFromObject(account: js.Object): Account
  
  /**
    * Email address verification
    */
  val verified: Boolean
}
object Account {
  
  inline def apply(
    client: Client,
    credits: Double,
    email: String,
    get: () => js.Promise[Account],
    name: String,
    setFromObject: js.Object => Account,
    verified: Boolean
  ): Account = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], credits = credits.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], get = js.Any.fromFunction0(get), name = name.asInstanceOf[js.Any], setFromObject = js.Any.fromFunction1(setFromObject), verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  extension [Self <: Account](x: Self) {
    
    inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setCredits(value: Double): Self = StObject.set(x, "credits", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setGet(value: () => js.Promise[Account]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSetFromObject(value: js.Object => Account): Self = StObject.set(x, "setFromObject", js.Any.fromFunction1(value))
    
    inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
  }
}
