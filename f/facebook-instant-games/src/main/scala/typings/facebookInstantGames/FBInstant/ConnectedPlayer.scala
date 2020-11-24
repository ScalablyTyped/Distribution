package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents information about a player who is connected to the current player.
  */
@js.native
trait ConnectedPlayer extends js.Object {
  
  /**
    * Get the id of the connected player.
    *
    * @returns The ID of the connected player
    */
  def getID(): String = js.native
  
  /**
    * Get the player's full name.
    *
    * @returns The player's full name
    */
  def getName(): String | Null = js.native
  
  /**
    * Get the player's public profile photo.
    *
    * @returns A url to the player's public profile photo
    */
  def getPhoto(): String | Null = js.native
}
object ConnectedPlayer {
  
  @scala.inline
  def apply(getID: () => String, getName: () => String | Null, getPhoto: () => String | Null): ConnectedPlayer = {
    val __obj = js.Dynamic.literal(getID = js.Any.fromFunction0(getID), getName = js.Any.fromFunction0(getName), getPhoto = js.Any.fromFunction0(getPhoto))
    __obj.asInstanceOf[ConnectedPlayer]
  }
  
  @scala.inline
  implicit class ConnectedPlayerOps[Self <: ConnectedPlayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetID(value: () => String): Self = this.set("getID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String | Null): Self = this.set("getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPhoto(value: () => String | Null): Self = this.set("getPhoto", js.Any.fromFunction0(value))
  }
}
