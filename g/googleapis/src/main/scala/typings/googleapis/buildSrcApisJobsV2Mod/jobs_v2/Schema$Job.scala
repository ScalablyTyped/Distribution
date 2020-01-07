package typings.googleapis.buildSrcApisJobsV2Mod.jobs_v2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Job resource represents a job posting (also referred to as a &quot;job
  * listing&quot; or &quot;job requisition&quot;). A job belongs to a Company,
  * which is the hiring entity responsible for the job.
  */
@js.native
trait Schema$Job extends js.Object {
  /**
    * Optional but at least one of application_urls, application_email_list or
    * application_instruction must be specified.  Use this field to specify
    * email address(es) to which resumes or applications can be sent.  The
    * maximum number of allowed characters is 255.
    */
  var applicationEmailList: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional but at least one of application_urls, application_email_list or
    * application_instruction must be specified.  Use this field to provide
    * instructions, such as &quot;Mail your application to ...&quot;, that a
    * candidate can follow to apply for the job.  This field accepts and
    * sanitizes HTML input, and also accepts bold, italic, ordered list, and
    * unordered list markup tags.  The maximum number of allowed characters is
    * 3,000.
    */
  var applicationInstruction: js.UndefOr[String] = js.native
  /**
    * Optional but at least one of application_urls, application_email_list or
    * application_instruction must be specified.  Use this URL field to direct
    * an applicant to a website, for example to link to an online application
    * form.  The maximum number of allowed characters is 2,000.
    */
  var applicationUrls: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional.  The benefits included with the job.
    */
  var benefits: js.UndefOr[js.Array[String]] = js.native
  /**
    * Output only.  The name of the company listing the job.
    */
  var companyDisplayName: js.UndefOr[String] = js.native
  /**
    * Optional but one of company_name or distributor_company_id must be
    * provided.  The resource name of the company listing the job, such as
    * /companies/foo. This field takes precedence over the distributor-assigned
    * company identifier, distributor_company_id.
    */
  var companyName: js.UndefOr[String] = js.native
  /**
    * Deprecated. Use company_display_name instead.  Output only.  The name of
    * the company listing the job.
    */
  var companyTitle: js.UndefOr[String] = js.native
  /**
    * Optional.  Job compensation information.
    */
  var compensationInfo: js.UndefOr[Schema$CompensationInfo] = js.native
  /**
    * Output only.  The timestamp when this job was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Optional.  A map of fields to hold both filterable and non-filterable
    * custom job attributes that are not covered by the provided structured
    * fields.  This field is a more general combination of the deprecated
    * id-based filterable_custom_fields and string-based
    * non_filterable_custom_fields.  The keys of the map are strings up to 64
    * bytes and must match the pattern: a-zA-Z*.  At most 100 filterable and at
    * most 100 unfilterable keys are supported. For filterable `string_values`,
    * across all keys at most 200 values are allowed, with each string no more
    * than 255 characters. For unfilterable `string_values`, the maximum total
    * size of `string_values` across all keys is 50KB.
    */
  var customAttributes: js.UndefOr[StringDictionary[Schema$CustomAttribute]] = js.native
  /**
    * Optional.  The department or functional area within the company with the
    * open position.  The maximum number of allowed characters is 255.
    */
  var department: js.UndefOr[String] = js.native
  /**
    * Required.  The description of the job, which typically includes a
    * multi-paragraph description of the company and related information.
    * Separate fields are provided on the job object for responsibilities,
    * qualifications, and other job characteristics. Use of these separate job
    * fields is recommended.  This field accepts and sanitizes HTML input, and
    * also accepts bold, italic, ordered list, and unordered list markup tags.
    * The maximum number of allowed characters is 100,000.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Optional but one of company_name or distributor_company_id must be
    * provided.  A unique company identifier used by job distributors to
    * identify an employer&#39;s company entity. company_name takes precedence
    * over this field, and is the recommended field to use to identify
    * companies.  The maximum number of allowed characters is 255.
    */
  var distributorCompanyId: js.UndefOr[String] = js.native
  /**
    * Optional.  The desired education level for the job, such as
    * &quot;Bachelors&quot;, &quot;Masters&quot;, &quot;Doctorate&quot;.
    */
  var educationLevels: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional.  The employment type(s) of a job, for example, full time or
    * part time.
    */
  var employmentTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional.  The end date of the job in UTC time zone. Typically this field
    * is used for contracting engagements. Dates prior to 1970/1/1 and invalid
    * date formats are ignored.
    */
  var endDate: js.UndefOr[Schema$Date] = js.native
  /**
    * Optional but strongly recommended for the best service experience.  The
    * expiration timestamp of the job. After this timestamp, the job is marked
    * as expired, and it no longer appears in search results. The expired job
    * can&#39;t be deleted or listed by the DeleteJob and ListJobs APIs, but it
    * can be retrieved with the GetJob API or updated with the UpdateJob API.
    * An expired job can be updated and opened again by using a future
    * expiration timestamp. Updating an expired job fails if there is another
    * existing open job with same requisition_id, company_name and
    * language_code.  The expired jobs are retained in our system for 90 days.
    * However, the overall expired job count cannot exceed 3 times the maximum
    * of open jobs count over the past week, otherwise jobs with earlier expire
    * time are cleaned first. Expired jobs are no longer accessible after they
    * are cleaned out. The format of this field is RFC 3339 date strings.
    * Example: 2000-01-01T00:00:00.999999999Z See
    * [https://www.ietf.org/rfc/rfc3339.txt](https://www.ietf.org/rfc/rfc3339.txt).
    * A valid date range is between 1970-01-01T00:00:00.0Z and
    * 2100-12-31T23:59:59.999Z. Invalid dates are ignored and treated as expire
    * time not provided.  If this value is not provided at the time of job
    * creation or is invalid, the job posting expires after 30 days from the
    * job&#39;s creation time. For example, if the job was created on
    * 2017/01/01 13:00AM UTC with an unspecified expiration date, the job
    * expires after 2017/01/31 13:00AM UTC.  If this value is not provided but
    * expiry_date is, expiry_date is used.  If this value is not provided on
    * job update, it depends on the field masks set by
    * UpdateJobRequest.update_job_fields. If the field masks include
    * expiry_time, or the masks are empty meaning that every field is updated,
    * the job posting expires after 30 days from the job&#39;s last update
    * time. Otherwise the expiration date isn&#39;t updated.
    */
  var expireTime: js.UndefOr[String] = js.native
  /**
    * Deprecated. Use expire_time instead.  Optional but strongly recommended
    * to be provided for the best service experience.  The expiration date of
    * the job in UTC time. After 12 am on this date, the job is marked as
    * expired, and it no longer appears in search results. The expired job
    * can&#39;t be deleted or listed by the DeleteJob and ListJobs APIs, but it
    * can be retrieved with the GetJob API or updated with the UpdateJob API.
    * An expired job can be updated and opened again by using a future
    * expiration date. It can also remain expired. Updating an expired job to
    * be open fails if there is another existing open job with same
    * requisition_id, company_name and language_code.  The expired jobs are
    * retained in our system for 90 days. However, the overall expired job
    * count cannot exceed 3 times the maximum of open jobs count over the past
    * week, otherwise jobs with earlier expire time are removed first. Expired
    * jobs are no longer accessible after they are cleaned out.  A valid date
    * range is between 1970/1/1 and 2100/12/31. Invalid dates are ignored and
    * treated as expiry date not provided.  If this value is not provided on
    * job creation or is invalid, the job posting expires after 30 days from
    * the job&#39;s creation time. For example, if the job was created on
    * 2017/01/01 13:00AM UTC with an unspecified expiration date, the job
    * expires after 2017/01/31 13:00AM UTC.  If this value is not provided on
    * job update, it depends on the field masks set by
    * UpdateJobRequest.update_job_fields. If the field masks include
    * expiry_date, or the masks are empty meaning that every field is updated,
    * the job expires after 30 days from the job&#39;s last update time.
    * Otherwise the expiration date isn&#39;t updated.
    */
  var expiryDate: js.UndefOr[Schema$Date] = js.native
  /**
    * Deprecated. Always use compensation_info.  Optional.  Job compensation
    * information.  This field replaces compensation_info. Only
    * CompensationInfo.entries or extended_compensation_info can be set,
    * otherwise an exception is thrown.
    */
  var extendedCompensationInfo: js.UndefOr[Schema$ExtendedCompensationInfo] = js.native
  /**
    * Deprecated. Use custom_attributes instead.  Optional.  A map of fields to
    * hold filterable custom job attributes not captured by the standard fields
    * such as job_title, company_name, or level. These custom fields store
    * arbitrary string values, and can be used for purposes not covered by the
    * structured fields. For the best search experience, use of the structured
    * rather than custom fields is recommended.  Data stored in these custom
    * fields fields are indexed and searched against by keyword searches (see
    * SearchJobsRequest.custom_field_filters][]).  The map key must be a number
    * between 1-20. If an invalid key is provided on job create or update, an
    * error is returned.
    */
  var filterableCustomFields: js.UndefOr[StringDictionary[Schema$CustomField]] = js.native
  /**
    * Optional.  A description of bonus, commission, and other compensation
    * incentives associated with the job not including salary or pay.  The
    * maximum number of allowed characters is 10,000.
    */
  var incentives: js.UndefOr[String] = js.native
  /**
    * Output only.  Structured locations of the job, resolved from locations.
    */
  var jobLocations: js.UndefOr[js.Array[Schema$JobLocation]] = js.native
  /**
    * Required.  The title of the job, such as &quot;Software Engineer&quot;
    * The maximum number of allowed characters is 500.
    */
  var jobTitle: js.UndefOr[String] = js.native
  /**
    * Optional.  The language of the posting. This field is distinct from any
    * requirements for fluency that are associated with the job.  Language
    * codes must be in BCP-47 format, such as &quot;en-US&quot; or
    * &quot;sr-Latn&quot;. For more information, see [Tags for Identifying
    * Languages](https://tools.ietf.org/html/bcp47){:
    * class=&quot;external&quot; target=&quot;_blank&quot; }.  If this field is
    * unspecified and Job.description is present, detected language code based
    * on Job.description is assigned, otherwise defaults to &#39;en_US&#39;.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Optional.  The experience level associated with the job, such as
    * &quot;Entry Level&quot;.
    */
  var level: js.UndefOr[String] = js.native
  /**
    * Optional but strongly recommended for the best service experience.
    * Location(s) where the emploeyer is looking to hire for this job posting.
    * Specifying the full street address(es) of the hiring location enables
    * better API results, especially job searches by commute time.  At most 50
    * locations are allowed for best search performance. If a job has more
    * locations, it is suggested to split it into multiple jobs with unique
    * requisition_ids (e.g. &#39;ReqA&#39; becomes &#39;ReqA-1&#39;,
    * &#39;ReqA-2&#39;, etc.) as multiple jobs with the same requisition_id,
    * company_name and language_code are not allowed. If the original
    * requisition_id must be preserved, a custom field should be used for
    * storage. It is also suggested to group the locations that close to each
    * other in the same job for better search experience.  The maximum number
    * of allowed characters is 500.
    */
  var locations: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required during job update.  Resource name assigned to a job by the API,
    * for example, &quot;/jobs/foo&quot;. Use of this field in job queries and
    * API calls is preferred over the use of requisition_id since this value is
    * unique.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional.  A promotion value of the job, as determined by the client. The
    * value determines the sort order of the jobs returned when searching for
    * jobs using the featured jobs search call, with higher promotional values
    * being returned first and ties being resolved by relevance sort. Only the
    * jobs with a promotionValue &gt;0 are returned in a FEATURED_JOB_SEARCH.
    * Default value is 0, and negative values are treated as 0.
    */
  var promotionValue: js.UndefOr[Double] = js.native
  /**
    * Optional.  The date this job was most recently published in UTC format.
    * The default value is the time the request arrives at the server.
    */
  var publishDate: js.UndefOr[Schema$Date] = js.native
  /**
    * Optional.  A description of the qualifications required to perform the
    * job. The use of this field is recommended as an alternative to using the
    * more general description field.  This field accepts and sanitizes HTML
    * input, and also accepts bold, italic, ordered list, and unordered list
    * markup tags.  The maximum number of allowed characters is 10,000.
    */
  var qualifications: js.UndefOr[String] = js.native
  /**
    * Output only.  The URL of a web page that displays job details.
    */
  var referenceUrl: js.UndefOr[String] = js.native
  /**
    * Optional.  The job Region (for example, state, country) throughout which
    * the job is available. If this field is set, a LocationFilter in a search
    * query within the job region finds this job if an exact location match is
    * not specified. If this field is set, setting job locations to the same
    * location level as this field is strongly recommended.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Required.  The requisition ID, also referred to as the posting ID,
    * assigned by the client to identify a job. This field is intended to be
    * used by clients for client identification and tracking of listings. A job
    * is not allowed to be created if there is another job with the same
    * requisition_id, company_name and language_code.  The maximum number of
    * allowed characters is 255.
    */
  var requisitionId: js.UndefOr[String] = js.native
  /**
    * Optional.  A description of job responsibilities. The use of this field
    * is recommended as an alternative to using the more general description
    * field.  This field accepts and sanitizes HTML input, and also accepts
    * bold, italic, ordered list, and unordered list markup tags.  The maximum
    * number of allowed characters is 10,000.
    */
  var responsibilities: js.UndefOr[String] = js.native
  /**
    * Optional.  The start date of the job in UTC time zone. Typically this
    * field is used for contracting engagements. Dates prior to 1970/1/1 and
    * invalid date formats are ignored.
    */
  var startDate: js.UndefOr[Schema$Date] = js.native
  /**
    * Deprecated. Use custom_attributes instead.  Optional.  A map of fields to
    * hold non-filterable custom job attributes, similar to
    * filterable_custom_fields. These fields are distinct in that the data in
    * these fields are not indexed. Therefore, the client cannot search against
    * them, nor can the client use them to list jobs.  The key of the map can
    * be any valid string.
    */
  var unindexedCustomFields: js.UndefOr[StringDictionary[Schema$CustomField]] = js.native
  /**
    * Output only.  The timestamp when this job was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Optional.  The visibility of the job. Defaults to JobVisibility.PRIVATE
    * if not specified. Currently only JobVisibility.PRIVATE is supported.
    */
  var visibility: js.UndefOr[String] = js.native
}

object Schema$Job {
  @scala.inline
  def apply(
    applicationEmailList: js.Array[String] = null,
    applicationInstruction: String = null,
    applicationUrls: js.Array[String] = null,
    benefits: js.Array[String] = null,
    companyDisplayName: String = null,
    companyName: String = null,
    companyTitle: String = null,
    compensationInfo: Schema$CompensationInfo = null,
    createTime: String = null,
    customAttributes: StringDictionary[Schema$CustomAttribute] = null,
    department: String = null,
    description: String = null,
    distributorCompanyId: String = null,
    educationLevels: js.Array[String] = null,
    employmentTypes: js.Array[String] = null,
    endDate: Schema$Date = null,
    expireTime: String = null,
    expiryDate: Schema$Date = null,
    extendedCompensationInfo: Schema$ExtendedCompensationInfo = null,
    filterableCustomFields: StringDictionary[Schema$CustomField] = null,
    incentives: String = null,
    jobLocations: js.Array[Schema$JobLocation] = null,
    jobTitle: String = null,
    languageCode: String = null,
    level: String = null,
    locations: js.Array[String] = null,
    name: String = null,
    promotionValue: Int | Double = null,
    publishDate: Schema$Date = null,
    qualifications: String = null,
    referenceUrl: String = null,
    region: String = null,
    requisitionId: String = null,
    responsibilities: String = null,
    startDate: Schema$Date = null,
    unindexedCustomFields: StringDictionary[Schema$CustomField] = null,
    updateTime: String = null,
    visibility: String = null
  ): Schema$Job = {
    val __obj = js.Dynamic.literal()
    if (applicationEmailList != null) __obj.updateDynamic("applicationEmailList")(applicationEmailList.asInstanceOf[js.Any])
    if (applicationInstruction != null) __obj.updateDynamic("applicationInstruction")(applicationInstruction.asInstanceOf[js.Any])
    if (applicationUrls != null) __obj.updateDynamic("applicationUrls")(applicationUrls.asInstanceOf[js.Any])
    if (benefits != null) __obj.updateDynamic("benefits")(benefits.asInstanceOf[js.Any])
    if (companyDisplayName != null) __obj.updateDynamic("companyDisplayName")(companyDisplayName.asInstanceOf[js.Any])
    if (companyName != null) __obj.updateDynamic("companyName")(companyName.asInstanceOf[js.Any])
    if (companyTitle != null) __obj.updateDynamic("companyTitle")(companyTitle.asInstanceOf[js.Any])
    if (compensationInfo != null) __obj.updateDynamic("compensationInfo")(compensationInfo.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (customAttributes != null) __obj.updateDynamic("customAttributes")(customAttributes.asInstanceOf[js.Any])
    if (department != null) __obj.updateDynamic("department")(department.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (distributorCompanyId != null) __obj.updateDynamic("distributorCompanyId")(distributorCompanyId.asInstanceOf[js.Any])
    if (educationLevels != null) __obj.updateDynamic("educationLevels")(educationLevels.asInstanceOf[js.Any])
    if (employmentTypes != null) __obj.updateDynamic("employmentTypes")(employmentTypes.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (expireTime != null) __obj.updateDynamic("expireTime")(expireTime.asInstanceOf[js.Any])
    if (expiryDate != null) __obj.updateDynamic("expiryDate")(expiryDate.asInstanceOf[js.Any])
    if (extendedCompensationInfo != null) __obj.updateDynamic("extendedCompensationInfo")(extendedCompensationInfo.asInstanceOf[js.Any])
    if (filterableCustomFields != null) __obj.updateDynamic("filterableCustomFields")(filterableCustomFields.asInstanceOf[js.Any])
    if (incentives != null) __obj.updateDynamic("incentives")(incentives.asInstanceOf[js.Any])
    if (jobLocations != null) __obj.updateDynamic("jobLocations")(jobLocations.asInstanceOf[js.Any])
    if (jobTitle != null) __obj.updateDynamic("jobTitle")(jobTitle.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (promotionValue != null) __obj.updateDynamic("promotionValue")(promotionValue.asInstanceOf[js.Any])
    if (publishDate != null) __obj.updateDynamic("publishDate")(publishDate.asInstanceOf[js.Any])
    if (qualifications != null) __obj.updateDynamic("qualifications")(qualifications.asInstanceOf[js.Any])
    if (referenceUrl != null) __obj.updateDynamic("referenceUrl")(referenceUrl.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (requisitionId != null) __obj.updateDynamic("requisitionId")(requisitionId.asInstanceOf[js.Any])
    if (responsibilities != null) __obj.updateDynamic("responsibilities")(responsibilities.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (unindexedCustomFields != null) __obj.updateDynamic("unindexedCustomFields")(unindexedCustomFields.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Job]
  }
}

