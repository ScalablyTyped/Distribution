package typings
package gapiDotClientDotPlaymoviespartnerLib.gapiNs.clientNs.playmoviespartnerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StoreInfo extends js.Object {
  /** Audio tracks available for this Edit. */
  var audioTracks: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * Country where Edit is available in ISO 3166-1 alpha-2 country
               * code.
               * Example: "US".
               */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Edit-level EIDR ID.
               * Example: "10.5240/1489-49A2-3956-4B2D-FE16-6".
               */
  var editLevelEidr: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The number assigned to the episode within a season.
               * Only available on TV Edits.
               * Example: "1".
               */
  var episodeNumber: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the Edit has a 5.1 channel audio track. */
  var hasAudio51: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the Edit has a EST offer. */
  var hasEstOffer: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the Edit has a HD offer. */
  var hasHdOffer: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the Edit has info cards. */
  var hasInfoCards: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the Edit has a SD offer. */
  var hasSdOffer: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the Edit has a VOD offer. */
  var hasVodOffer: js.UndefOr[scala.Boolean] = js.undefined
  /** Timestamp when the Edit went live on the Store. */
  var liveTime: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Knowledge Graph ID associated to this Edit, if available.
               * This ID links the Edit to its knowledge entity, externally accessible
               * at http://freebase.com.
               * In the absense of Title EIDR or Edit EIDR, this ID helps link together
               * multiple Edits across countries.
               * Example: '/m/0ffx29'
               */
  var mid: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Default Edit name, usually in the language of the country of
               * origin.
               * Example: "Googlers, The".
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the post-production houses that manage the Edit. */
  var pphNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * Google-generated ID identifying the season linked to the Edit.
               * Only available for TV Edits.
               * Example: 'ster23ex'
               */
  var seasonId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Default Season name, usually in the language of the country of
               * origin.
               * Only available for TV Edits
               * Example: "Googlers, The - A Brave New World".
               */
  var seasonName: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The number assigned to the season within a show.
               * Only available on TV Edits.
               * Example: "1".
               */
  var seasonNumber: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Google-generated ID identifying the show linked to the Edit.
               * Only available for TV Edits.
               * Example: 'et2hsue_x'
               */
  var showId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Default Show name, usually in the language of the country of
               * origin.
               * Only available for TV Edits
               * Example: "Googlers, The".
               */
  var showName: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the studio that owns the Edit ordered. */
  var studioName: js.UndefOr[java.lang.String] = js.undefined
  /** Subtitles available for this Edit. */
  var subtitles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * Title-level EIDR ID.
               * Example: "10.5240/1489-49A2-3956-4B2D-FE16-5".
               */
  var titleLevelEidr: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Google-generated ID identifying the trailer linked to the Edit.
               * Example: 'bhd_4e_cx'
               */
  var trailerId: js.UndefOr[java.lang.String] = js.undefined
  /** Edit type, like Movie, Episode or Season. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Google-generated ID identifying the video linked to the Edit.
               * Example: 'gtry456_xc'
               */
  var videoId: js.UndefOr[java.lang.String] = js.undefined
}

